package Poker;
import java.util.Random;

public class Deck {

    /**
     * deck field variable
     */
    private Card[] deck;
    private int deckSize;
    /**
     * constructor for the deck object,
     * created an unshuffled deck of 52 cards 
     */
    public Deck() {
        deck = new Card[52]; 
        deckSize = 52;
        for ( int i = 2; i<15;i++) {
        deck[i-2] = new Card("hearts", i);
        }
        for ( int i = 2; i<15;i++) {
            deck[i+11] = new Card("diamonds", i);
        }
        for ( int i = 2; i<15;i++) {
            deck[i+24] = new Card("clubs", i);
        }
        for ( int i = 2; i<15;i++) {
            deck[i+37] = new Card("spades", i);
        }
        
    }
    /**
     * getter method that returns the card array of the deck
     * object
     * @return Card[]
     */
    public Card[] getCardArray() {
        return deck;
    }
    /**
     * getter method that returns the size of the deck.
     * when cards are dealt from the deck the deck will decrease
     * in size
     * @return int size of the deck  
     */
    public int getDeckSize() {
        return deckSize;
    }
    /**
     * returns the index of the card if its present in deck,
     * returns -1 if a card is not in the deck.
     * @param otherCard, the card we are trying to find 
     *  in the deck
     * @return int index of card in the deck 
     */
    public int cardIndex(Card otherCard) {
        int index = -1;
        for (int i=0; i<52; i++) {
            if(deck[i].equals(otherCard)) {
                index = i;
                break;
            }
        }    
        return index;
    }
    /**
     * removes specified card object from deck, nulls the index and then
     * moves the nulled index to the front of the array 
     * @param card is the card we wish to remove from the array 
     * @return Card is the card once it is removed from the array
     */
    public Card removeCard(Card card) {
        Card removedCard = null;
        // check to see if card is in deck, if so where
        if (cardIndex(card) != -1) {
            // assign index of card to int index
            int index = cardIndex(card);
            // assign card at index to removedCard
            removedCard = deck[index];
            // null the location in the deck of the card we wish to remove,
            // creating a null entry in the deck at deck[index] 
            deck[index] = null;
            // taking the null index of the deck and swapping it with the 
            // first non null location in the deck, effectively shifting 
            // the null spots of the deck to the bottom of the deck
            int i = 0;
            // if the first index of the array is not null, ie the array is full
            if (deck[i]!=null) {
                // swapping the two indexes of the array
                deck[index] = deck[i];
                deck[i] = null;
            }
            // if the first index is null, will find the first non 
            // null index of the array 
            else {
                while (deck[i] == null) {
                    i++;
                }
                // swapping the indexes of the array
                deck[index] = deck[i];
                deck[i] = null;
            }
        }
        // Decrementing the size of the deck.
        deckSize--;
        return removedCard;
    }
    /**
     * shuffles the deck of cards by swapping each card
     * in the deck with another card at a random index
     */
     public void shuffle() {
         Card temp = null;
         Random ranIndex = new Random();
         for(int i=0 ; i<52; i++) {
             temp= deck[i];
             int ran = ranIndex.nextInt(51);
             deck[i]= deck[ran];
             deck[ran]= temp;  
         }
     }
     /**
      * gets the card at the top of the deck 
      * and then uses the removeCard method to remove the card
      * and shift the null index to the bottom of the deck 
      * returns null if deck is empty 
      * @return the card object that is removed from the top of deck
      *    
      */
     public Card dealCard() {
         if (deckSize>0) {
             return removeCard(deck[51]);
         }
         else 
             return null;
     }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[]args) {
          
       
    }
}
