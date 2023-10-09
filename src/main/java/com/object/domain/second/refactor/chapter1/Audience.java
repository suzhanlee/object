package com.object.domain.second.refactor.chapter1;

public class Audience {

    private Bag bag;

    public Long buyTicket(Ticket ticket) {
        return bag.hold(ticket);
    }
}
