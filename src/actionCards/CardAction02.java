package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestPlayerForces;
import gameStatesDefault.GameState;

public class CardAction02 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 2;
	}

	@Override
	public int getShields() {
		return 2;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionMoveTowardsClosestPlayerForces.class;
	}

	@Override
	public int getCommandPoints() {
		return 3;
	}

	@Override
	public EPriority getEPriority() {
		return EPriority.DESCENDING;
	}

}
