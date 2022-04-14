package com.training;

import com.training.model.CreditCard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CreditCard card2 = new CreditCard(246, "revathy",45000);
        CreditCardService service = new CreditCardService();
        service.addCard(card2);
    
    CreditCard[] cards2 = service.getcard();
    double total=0;
    for(CreditCard eachCard:cards2) {
    	System.out.println(eachCard);
    	total=total+eachCard.getAmountdue();
    }
    System.out.println(total);
}
}
