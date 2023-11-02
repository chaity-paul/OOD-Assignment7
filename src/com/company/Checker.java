package com.company;

public class Checker {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(10);
        vendingMachine.doDispense();

        vendingMachine.doRefill();
        vendingMachine.doDispense();

        vendingMachine.doDispense();

        vendingMachine.doRefill();
        vendingMachine.doRefill();

        vendingMachine.doReturnMoney();

        vendingMachine.doDispense();

    }
}
