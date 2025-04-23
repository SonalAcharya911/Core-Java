package com.xworkz.external.impl;

import com.xworkz.internal.rule.ATM;

public class UnionBankATMImpl implements ATM {


    @Override
    public void insertCard() {
        System.out.println("running insertCard in UnionBankATMImpl");
    }

    @Override
    public void enterPin() {
        System.out.println("running enterPin in UnionBankATMImpl");
    }

    @Override
    public void checkBalance() {
        System.out.println("running checkBalance in UnionBankATMImpl");
    }

    @Override
    public void withdrawCash() {
        System.out.println("running withdrawCash in UnionBankATMImpl");
    }

    @Override
    public void depositCash() {
        System.out.println("running depositCash in UnionBankATMImpl");
    }

    @Override
    public void printReceipt() {
        System.out.println("running printReceipt in UnionBankATMImpl");
    }

    @Override
    public void ejectCard() {
        System.out.println("running ejectCard in UnionBankATMImpl");
    }
}
