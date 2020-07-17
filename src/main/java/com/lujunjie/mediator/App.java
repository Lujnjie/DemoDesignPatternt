package com.lujunjie.mediator;

/**
 * 中介者模式
 */
public class App {
    public static void main(String[] args) {
        Party party = new PartyImpl();

        PartyMember partyMember = new Dancer();
        party.addPartyMember(partyMember);


        partyMember.act(Action.DANCE);
    }
}
