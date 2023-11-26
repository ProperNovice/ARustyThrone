package utils;

import business.Credentials;
import utils.Enums.MapImageViews;
import utils.Interfaces.IImageViewAble;

public enum ImageViewClone {

	INSTANCE;

	private ImageViewClone() {

	}

	public void setImage(IImageViewAble imageViewAble) {
		ImageViewCloneInadicator.INSTANCE.setImage(imageViewAble);
	}

	public void setVisibleFalse() {
		ImageViewCloneInadicator.INSTANCE.getImageView().setVisible(false);
	}

	private enum ImageViewCloneInadicator implements IImageViewAble {

		INSTANCE;

		private HashMap<String, Image> map = new HashMap<>();

		private ImageViewCloneInadicator() {

		}

		public void setImage(IImageViewAble imageViewAble) {

			Image image = imageViewAble.getImageView().getImageShowing();

			String filePath = image.getFilePath();

			if (!this.map.containsKey(filePath))
				this.map.put(filePath, new Image(filePath));

			Image imageClone = this.map.getValue(filePath);

			if (!MapImageViews.INSTANCE.getImageViewsMap().containsKey(this))
				new ImageView(imageClone, this);

			else {

				getImageView().setImage(imageClone);
				getImageView().setVisible(true);

			}

			getImageView().relocateTopLeft(Credentials.INSTANCE.cImageViewClone);

		}

	}

}
