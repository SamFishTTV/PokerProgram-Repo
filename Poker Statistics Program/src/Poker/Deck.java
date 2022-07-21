package Poker;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    private Card[] deck;
    
    public Deck() {
        deck = new Card[52]; 
        
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
    
    public Card[] getCardArray() {
        return deck;
    }
    
    
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[]args) {
          
       
    }
}
