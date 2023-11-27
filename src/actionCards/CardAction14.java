package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestCastle;
import gameStatesDefault.GameState;

public class CardAction14 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 14;
	}

	@Override
	public int getBugles() {
		return 2;
	}

	@Override
	public int getSwords() {
		return 2;
	}

	@Override
	protected Class<? extends GameState> getKingActionsFirst() {
		return KingActionMoveTowardsClosestCastle.class;
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
