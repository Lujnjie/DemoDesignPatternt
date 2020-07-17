package com.lujunjie.mediator;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements Party {

    private List<PartyMember> members;

    public PartyImpl() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addPartyMember(PartyMember member) {
        members.add(member);
        member.joinParty(this);
    }

    @Override
    public void act(PartyMember member, Action action) {
        for (PartyMember partyMember : members) {
            if (partyMember.equals(member)) {
                member.partyAction(action);
            }
        }
    }
}
