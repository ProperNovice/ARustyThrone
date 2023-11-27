package actionCards;

import enums.EPriority;
import gameStates.KingActionRally;
import gameStatesDefault.GameState;

public class CardAction11 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 11;
	}

	@Override
	public int getShields() {
		return 1;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionRally.class;
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
