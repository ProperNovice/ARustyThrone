package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestPlayerForces;
import gameStatesDefault.GameState;

public class CardAction09 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 9;
	}

	@Override
	public int getBugles() {
		return 1;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionMoveTowardsClosestPlayerForces.class;
	}

	@Override
	protected Class<? extends GameState> getKingActionsSecond() {
		return KingActionMoveTowardsClosestPlayerForces.class;
	}

	@Override
	public int getCommandPoints() {
		return 5;
	}

	@Override
	public EPriority getEPriority() {
		return EPriority.DESCENDING;
	}

}
