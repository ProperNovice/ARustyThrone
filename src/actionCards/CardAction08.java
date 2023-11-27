package actionCards;

import enums.EPriority;
import gameStates.KingActionUncertainOrders;
import gameStatesDefault.GameState;

public class CardAction08 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 8;
	}

	@Override
	public int getBugles() {
		return 1;
	}

	@Override
	public int getSwords() {
		return 1;
	}

	@Override
	public int getShields() {
		return 1;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionUncertainOrders.class;
	}

	@Override
	public int getCommandPoints() {
		return 4;
	}

	@Override
	public EPriority getEPriority() {
		return EPriority.DESCENDING;
	}

}
