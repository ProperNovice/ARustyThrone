package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestWheat;
import gameStatesDefault.GameState;

public class CardAction04 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 4;
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
		return KingActionMoveTowardsClosestWheat.class;
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
