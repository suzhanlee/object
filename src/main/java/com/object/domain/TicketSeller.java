package com.object.domain;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audience audience) {
        // 1. 관람객이 티켓을 산다.(산 금액 만큼 반환)
        // 2. 반환한 금액을 ticketOffice 에 저장한다.
        ticketOffice.sellTicketTo(audience);
    }
}

