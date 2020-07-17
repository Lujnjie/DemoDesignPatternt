package com.lujunjie.mediator;

public class App {
    public static void main(String[] args) {
        Party party = new PartyImpl();

        PartyMember partyMember = new Dancer();
        party.addPartyMember(partyMember);


        partyMember.act(Action.DANCE);
    }
}
