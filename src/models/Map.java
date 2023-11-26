package models;

import business.Credentials;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public enum Map implements IImageViewAble {

	INSTANCE;

	private Map() {

		String filePath = "map.png";
		new ImageView(filePath, this);
		getImageView().relocateTopLeft(Credentials.INSTANCE.cMap);

	}

}
