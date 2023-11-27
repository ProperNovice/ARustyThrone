package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestCastle;
import gameStatesDefault.GameState;

public class CardAction06 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 6;
	}

	@Override
	public int getSwords() {
		return 2;
	}

	@Override
	public int getShields() {
		return 1;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionMoveTowardsClosestCastle.class;
	}

	@Override
	public int getCommandPoints() {
		return 2;
	}

	@Override
	public EPriority getEPriority() {
		return EPriority.DESCENDING;
	}

}
