package Poker;

public class Card {

    private String suit;
    private int value;
    
    /*
     * the Card class constructor, created a single card object
     * @param suit is the suit of the card object being created as a string
     * @param value is the value of the card object being created as a string
     */
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }
    
    /*
     * 
     * gets the suit type and returns as a string
     * @return String , suit type
     */
    public String getSuit() {
        return suit;
    }
    /*
     * 
     * gets the value of card and returns as int 
     * @return Value ,  card value
     */
    public int getValue() {
        return value;
    }
    
    
      
    
    
    
    
    
    
}
