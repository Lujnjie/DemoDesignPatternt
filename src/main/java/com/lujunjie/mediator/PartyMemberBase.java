package com.lujunjie.mediator;

public abstract class PartyMemberBase implements PartyMember {
    private Party party;

    @Override
    public void joinParty(Party party) {
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(action.getDesc());
    }

    @Override
    public void act(Action action) {
        party.act(this, action);
    }

    public abstract String toString();
}
