package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestPlayerForces;
import gameStates.KingActionRally;
import gameStatesDefault.GameState;

public class CardAction16 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 16;
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
	protected Class<? extends GameState> getKingActionsSecond() {
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
