package business;

import actionCards.CardAction;
import actionCards.CardAction01;
import actionCards.CardAction02;
import actionCards.CardAction03;
import actionCards.CardAction04;
import actionCards.CardAction05;
import actionCards.CardAction06;
import actionCards.CardAction07;
import actionCards.CardAction08;
import actionCards.CardAction09;
import actionCards.CardAction10;
import actionCards.CardAction11;
import actionCards.CardAction12;
import actionCards.CardAction13;
import actionCards.CardAction14;
import actionCards.CardAction15;
import actionCards.CardAction16;
import actionCards.CardAction17;
import actionCards.CardAction18;
import utils.ArrayList;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		cardActions();

	}

	private void cardActions() {

		ArrayList<CardAction> list = null;

		// normal

		list = ListsManager.INSTANCE.cardsActionNormal;

		list.addLast(new CardAction01());
		list.addLast(new CardAction02());
		list.addLast(new CardAction03());
		list.addLast(new CardAction04());
		list.addLast(new CardAction05());
		list.addLast(new CardAction06());
		list.addLast(new CardAction07());
		list.addLast(new CardAction08());
		list.addLast(new CardAction09());
		list.addLast(new CardAction10());
		list.addLast(new CardAction11());
		list.addLast(new CardAction12());
		list.addLast(new CardAction13());
		list.addLast(new CardAction14());
		list.addLast(new CardAction15());
		list.addLast(new CardAction16());
		list.addLast(new CardAction17());
		list.addLast(new CardAction18());

		list.saveOriginal();

		list.getLast().print();

	}

}
