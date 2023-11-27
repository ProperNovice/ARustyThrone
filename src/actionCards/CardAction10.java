package actionCards;

import enums.EPriority;
import gameStates.KingActionRally;
import gameStatesDefault.GameState;

public class CardAction10 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 10;
	}

	@Override
	public int getShields() {
		return 2;
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
		return EPriority.ASCENDING;
	}

}
