package com.shellcore.java.exceptionhandling.entities;

import com.shellcore.java.exceptionhandling.exceptions.ExceededCreditCardLimitException;

/**
 * Created by Cesar. 06/06/2017.
 */
public class CreditCard {

    private double creditAviable;
    private double limit;
    private int number;

    public CreditCard(int number, double limit) {
        this.limit = limit;
        this.number = number;
        this.creditAviable = limit;
    }

    public void payCreditCard(double amount) {
        creditAviable += amount;
    }

    public void buy(double amount) throws ExceededCreditCardLimitException {
        if (amount <=creditAviable) {
            this.creditAviable -= amount;
        } else {
            double exceeded = amount - creditAviable;
            throw new ExceededCreditCardLimitException(exceeded);
        }
    }

    public String getCreditState() {
        return "Credit aviable: $" + this.creditAviable + ", Credit limit: $" + this.limit;
    }

    public double getCreditAviable() {
        return creditAviable;
    }

    public double getLimit() {
        return limit;
    }

    public int getNumber() {
        return number;
    }
}
