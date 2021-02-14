
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 * Richard Eid
 * 991365145
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card= new Card();
       
       card.setSuit("Dimonds");
       card.setValue(8);
       
       
        System.out.println("Your card is: "+ card.getValue() + " of " + card.getSuit());
    }
    
}
