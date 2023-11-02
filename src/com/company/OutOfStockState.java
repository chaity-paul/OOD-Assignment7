package com.company;

public class OutOfStockState implements  State{
    public void insertDollar( VendingMachine vendingMachine ) {
        System.out.println( "Out of product." );

    }
    public void ejectMoney( VendingMachine vendingMachine ) {
        System.out.println("no money to return");
    }
    public void dispense( VendingMachine vendingMachine ) {
        System.out.println( "No product to dispense" );
    }
}
