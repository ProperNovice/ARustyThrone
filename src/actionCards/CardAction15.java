package actionCards;

import enums.EPriority;
import gameStates.KingActionMoveTowardsClosestWheat;
import gameStatesDefault.GameState;

public class CardAction15 extends CardAction {

	@Override
	protected int getCardNumber() {
		return 15;
	}

	@Override
	public int getBugles() {
		return 1;
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
		return KingActionMoveTowardsClosestWheat.class;
	}

	@Override
	public int getCommandPoints() {
		return 2;
	}

	@Override
	public EPriority getEPriority() {
		return EPriority.ASCENDING;
	}

}
