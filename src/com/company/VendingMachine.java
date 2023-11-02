package com.company;

public class VendingMachine extends PopMachine{
    public VendingMachine(int count) {
        super(count);
    }
    public void setState(State state){
        this.currentState = state;
    }
    public State getHasOneDollarState(){
        return this.hasOneDollarState;
    }
    public State getIdleState(){
        return this.idleState;
    }
    public State getOutOfStockState(){
        return this.outOfStockState;
    }
    public void doReleaseProduct(){
        System.out.println("Vending Machine releasing product");
    }
    public void doRefill(){
        System.out.println("Vending Machine refilling: ");
        this.currentState.insertDollar(this);
    }
    public void doDispense(){
        System.out.println("Vending Machine dispensing: ");
        this.currentState.dispense(this);
    }
    public void doReturnMoney(){
        System.out.println("Vending Machine returning money: ");
        this.currentState.ejectMoney(this);
    }
}
