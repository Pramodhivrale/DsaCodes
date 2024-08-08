package com.chain;

import java.util.Scanner;

public class ChainOfResponsibility {

    DispenseChain chain;

    public ChainOfResponsibility() {
        this.chain = new Notes2000Rack();
        DispenseChain d1 = new Notes500Rack();
        DispenseChain d2 = new Notes100Rack();
        chain.setNextChain(d1);
        d1.setNextChain(d2);
    }

    public static void main(String[] args) {
        ChainOfResponsibility c = new ChainOfResponsibility();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter the amount to be withdrawn :");
            int amount = sc.nextInt();
            if (amount % 100 != 0) {
                System.out.println("Please enter multiples of 100");
                return;
            } else {
                c.chain.dispense(new Currency(amount));
            }
        }
       
    }
    
}

class Currency {
    private int amount;

    public Currency(int amt) {
        this.amount = amt;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

interface DispenseChain {
    void dispense(Currency currency);

    void setNextChain(DispenseChain nextChain);
}

class Notes2000Rack implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 2000) {
            int num = amount / 2000;
            int remainder = amount % 2000;
            System.out.println("Dispensing " + num + " 2000₹ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }
}

class Notes500Rack implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 500) {
            int num = amount / 500;
            int remainder = amount % 500;
            System.out.println("Dispensing " + num + " 500₹ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }
}

class Notes100Rack implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 100) {
            int num = amount / 100;
            int remainder = amount % 100;
            System.out.println("Dispensing " + num + " 100₹ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            System.out.println("Cannot dispense amount less than 100");
        }
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }
}
