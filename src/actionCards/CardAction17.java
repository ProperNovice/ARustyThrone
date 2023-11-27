package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestCastle;
import gameStates.KingActionRally;
import gameStatesDefault.GameState;

public class CardAction17 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 17;
	}

	@Override
	public int getSwords() {
		return 1;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionMoveTowardsClosestCastle.class;
	}

	@Override
	protected Class<? extends GameState> getKingActionsSecond() {
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
