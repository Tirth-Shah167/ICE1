/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice1;

/**
 * 
 * @author HP
 * @modifier Tirth Shah  // Add your name as modifier
 * @studentID 991752192 // Add your student number
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] allCards = new Card[7];
        
        for (int i = 0; i < allCards.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            allCards[i] = c;
        }
        
        Card yourCard = new Card();
        yourCard.setValue(9); 
        yourCard.setSuit("Spades"); 
        
        boolean found = false;
        for (Card card : allCards) {
            if (card.getValue() == yourCard.getValue() && 
                card.getSuit().equals(yourCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations! You Won....");
        } else {
            System.out.println("Sorry! Beter luck next time....");
        }
        
        System.out.println("\nLucky cards are:");
        for (Card card : allCards) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
        System.out.println("Your Card: " + yourCard.getValue() + " of " + yourCard.getSuit());
    }
}