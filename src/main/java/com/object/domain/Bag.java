package com.object.domain;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Invitation invitation, long amount) { // 초대장이 있는 경우
        this.invitation = invitation;
        this.amount = amount;
    }

    public Bag(long amount) { // 초대장이 없어 티켓을 사야하는 경우
        this(null, amount);
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) { // 초대장을 티켓으로 구현한다.
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }

    }
}
