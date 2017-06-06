package com.shellcore.java.exceptionhandling;

import com.shellcore.java.exceptionhandling.entities.CreditCard;
import com.shellcore.java.exceptionhandling.exceptions.ExceededCreditCardLimitException;

/**
 * Created by Cesar. 06/06/2017.
 */
public class Main {

    public static void main(String[] args) {

        // Limit: $2000.00
        CreditCard card = new CreditCard(62656565, 2000.0);
        System.out.println("Credit card state:");
        System.out.println(card.getCreditState());

        try {
            System.out.println("\n\tBuying $1500.00");
            card.buy(1500.0);

            System.out.println("\nCredit card state:");
            System.out.println(card.getCreditState());

            System.out.println("\n\tBuying $800.00");
            card.buy(800.0);
        } catch (ExceededCreditCardLimitException e) {
            System.out.println("Invalid buy, Limit Exceeded by " + e.getExceededAmount());
            e.printStackTrace();
        }
    }
}
