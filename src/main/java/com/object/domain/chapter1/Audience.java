package com.object.domain.chapter1;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() {
//        return bag;
//    }

    public Long buy(Ticket ticket) {
        /**
         *  bag가 가진 자원에 접근하던 것을 bag에서 접근하도록 만들면
         *  자연스럽게 bag는 자율적인 객체가 되며, 인터페이스와 구현이 분리되어
         *  변경에 용이해진다.
         */
        return bag.hold(ticket);
    }
}
