package actionCards;

import enums.EPriority;
import gameStates.KingActionUncertainOrders;
import gameStatesDefault.GameState;

public class CardAction18 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 18;
	}

	@Override
	public int getBugles() {
		return 2;
	}

	@Override
	public int getSwords() {
		return 1;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionUncertainOrders.class;
	}

	@Override
	public int getCommandPoints() {
		return 3;
	}

	@Override
	public EPriority getEPriority() {
		return EPriority.ASCENDING;
	}

}
