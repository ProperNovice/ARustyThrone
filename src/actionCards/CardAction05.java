package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestCastle;
import gameStatesDefault.GameState;

public class CardAction05 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 5;
	}

	@Override
	public int getSwords() {
		return 3;
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
