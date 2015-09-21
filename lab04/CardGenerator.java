//Alex Spiezio
//Card Generator Java Program


//  First compile the program
//      javac CardGenerator.java
    
    
//  Run the program
//      java CardGenerator//

import java.util.Random; //declare random number generator

//  define a class
public class CardGenerator {
    
    //  add main method
    public static void main(String[] args) {
        
        Random randomcard = new Random();
        int random = randomcard.nextInt(52);   //create random number 
        String suitString = "";
        
        if (random > 0 && random < 14) {
            suitString = "Diamonds";              // check which suit the card is
        }
        
        if (random > 13  && random < 27) {
            suitString = "Clubs";              // check which suit the card is
        }
        
        
        if (random > 26 && random < 40) {
            suitString = "Hearts";              // check which suit the card is
        }
        
        if (random > 39 && random < 53) {
            suitString = "Spades";              // check which suit the card is
        }
        
        random = random % 13;
        
        String cardString = ""; // string for card
        switch (random) {
            
            case 1: cardString = "Ace";
                    break;
            
            case 2: cardString = "2";
                    break;
                                
            case 3: cardString = "3";
                    break;
                                
            case 4: cardString = "4";
                    break;
                                
            case 5: cardString = "5";
                    break;
                                
            case 6: cardString = "6";                   // Cases for each card
                    break;
                                
            case 7: cardString = "7";
                    break;
                                
            case 8: cardString = "8";
                    break;
                                
            case 9: cardString = "9";
                    break;
                                
            case 10: cardString = "10";
                    break;
                                
            case 11: cardString = "Jack";
                    break;
                                
            case 12: cardString = "Queen";
                    break;
                                
            case 0: cardString = "King";
                    break;
        }
        
        System.out.println("Random Number: "+random);
        System.out.print("Your card is the "+cardString);       // print results
        System.out.println(" of "+suitString);
    }
}
        
        