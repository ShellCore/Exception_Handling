package com.shellcore.java.exceptionhandling.exceptions;

/**
 * Created by Cesar. 06/06/2017.
 */
public class ExceededCreditCardLimitException extends Exception {

    private double exceededAmount;

    public ExceededCreditCardLimitException(double exceededAmount) {
        this.exceededAmount = exceededAmount;
    }

    public double getExceededAmount() {
        return exceededAmount;
    }
}
