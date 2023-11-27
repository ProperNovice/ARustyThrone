package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestPlayerForces;
import gameStatesDefault.GameState;

public class CardAction01 extends CardAction {

	@Override
	protected int getCardNumber() {
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
		return KingActionMoveTowardsClosestPlayerForces.class;
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
