package actionCards;

import enums.EPriority;
import gameStatesDefault.GameState;
import utils.ArrayList;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.Logger;
import utils.ShutDown;

public abstract class CardAction implements IImageViewAble {

	private ArrayList<Class<? extends GameState>> kingActions = new ArrayList<>();

	public CardAction() {

		if (getKingActionsFirst() == null)
			ShutDown.INSTANCE.execute();

		this.kingActions.addLast(getKingActionsFirst());

		if (getKingActionsSecond() != null)
			this.kingActions.addLast(getKingActionsSecond());

		String fileName = "actionCards/";

		if (getCardNumber() < 10)
			fileName += "0";

		fileName += getCardNumber();
		fileName += ".jpg";

		new ImageView(fileName, this);
		getImageView().relocateTopLeft(1000, 50);

	}

	public final void print() {

		Logger.INSTANCE.log("/*");

		if (getBugles() > 0)
			Logger.INSTANCE.log("bugles: " + getBugles());
		if (getSwords() > 0)
			Logger.INSTANCE.log("swords: " + getSwords());
		if (getShields() > 0)
			Logger.INSTANCE.log("shields: " + getShields());

		for (Class<? extends GameState> gameStateClass : this.kingActions)
			Logger.INSTANCE.log(gameStateClass.getSimpleName());

		Logger.INSTANCE.log("command points: " + getCommandPoints());
		Logger.INSTANCE.log("priority: " + getEPriority());

		Logger.INSTANCE.logNewLine("*/");

	}

	@Override
	public final void handleMousePressedPrimary() {

	}

	protected abstract int getCardNumber();

	public int getBugles() {
		return 0;
	}

	public int getSwords() {
		return 0;
	}

	public int getShields() {
		return 0;
	}

	protected abstract Class<? extends GameState> getKingActionsFirst();

	protected Class<? extends GameState> getKingActionsSecond() {
		return null;
	}

	public abstract int getCommandPoints();

	public abstract EPriority getEPriority();

}
