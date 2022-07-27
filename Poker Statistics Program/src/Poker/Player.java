package Poker;

public class Player {
    
    /**
     * field variable, an array of 2 cards that will be each players hand 
     * initialized to size 2 in the constructor with 2 null indexes
     */
   public Card[] hand;
   public int handSize;
    /**
     * default constructor, initializes the array to an 
     * empty array of size two and then initializes the handSize
     * variable to 0 since there are no entries in hand yet
     */
    public Player() {
        hand= new Card[2];
        handSize = 0;
    }
    /**
     * tells if the player has a full hand or not 
     * @return boolean value if the players hand is full
     *  or not 
     */
    public boolean isHandFull() {
        if (handSize == 2) {
            return true;
        }
        else return false;
        
    }
    /**
     * adds a card to a players hand array then increments
     * handSize, will check to make sure the 
     * array is not full, if full the card will not be added.
     * @param card the card to be added
     */
    public void addCardToHand(Card card) {
        if (handSize==0) {
            hand[0] = card;
            handSize++;
        }
        else if(handSize==1) {
            hand[1] = card;    
            handSize++;
        }
    }
    
    
}
