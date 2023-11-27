package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestPlayerForces;
import gameStatesDefault.GameState;

public class CardAction13 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 13;
	}

	@Override
	public int getBugles() {
		return 3;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionMoveTowardsClosestPlayerForces.class;
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
