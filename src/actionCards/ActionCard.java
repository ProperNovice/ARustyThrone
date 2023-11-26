package actionCards;

import enums.EKingAction;
import enums.EPriority;
import utils.ArrayList;
import utils.Interfaces.IImageViewAble;

public abstract class ActionCard implements IImageViewAble {

	protected ArrayList<EKingAction> kingActions = new ArrayList<>();

	public ActionCard() {

	}

	public final void print() {

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

	protected abstract void addKingActions();

	public abstract int getCommandPoints();

	public abstract EPriority getEPriority();

}
