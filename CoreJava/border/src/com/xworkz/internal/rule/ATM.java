package com.xworkz.internal.rule;

public interface ATM {
    void insertCard();
    void enterPin();
    void checkBalance();
    void withdrawCash();
    void depositCash();
    void printReceipt();
    void ejectCard();
}
