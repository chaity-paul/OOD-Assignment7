package com.company;

public class PopMachine {
    protected State idleState;
    protected State hasOneDollarState;
    protected State outOfStockState;
    protected State currentState;
    protected int count;
    public PopMachine( int count ) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();
        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }
    public int getCount(){
        return count;
    }

}
