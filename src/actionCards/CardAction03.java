package actionCards;

import enums.EPriority;
import gameStates.KingActionRally;
import gameStatesDefault.GameState;

public class CardAction03 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 3;
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
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionRally.class;
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
