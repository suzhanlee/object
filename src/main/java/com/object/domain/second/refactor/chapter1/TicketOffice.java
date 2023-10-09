package com.object.domain.second.refactor.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }
    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void sellTo(Audience audience) {
        plusAmount(audience.buyTicket(getTicket()));
    }
}
