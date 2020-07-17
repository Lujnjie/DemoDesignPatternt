package com.lujunjie.mediator;

public interface Party {

    void addPartyMember(PartyMember member);

    void act(PartyMember member, Action action);
}
