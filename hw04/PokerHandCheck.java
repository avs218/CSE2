//Alex Spiezio
//Poker Hand Check Java Program


//  First compile the program
//      javac PokerHandCheck.java
    
    
//  Run the program
//      java PokerHandCheck//

import java.util.Random; //declare random number generator

//  define a class
public class PokerHandCheck {
    
    //  add main method
    public static void main(String[] args) {
        
        Random randomcard1 = new Random();
        int random1 = randomcard1.nextInt(52)+1;   //create random number 1
        
        Random randomcard2 = new Random();
        int random2 = randomcard2.nextInt(52)+1;   //create random number 2
        
        Random randomcard3 = new Random();
        int random3 = randomcard3.nextInt(52)+1;   //create random number 3
        
        Random randomcard4 = new Random();
        int random4 = randomcard4.nextInt(52)+1;   //create random number 4
        
        Random randomcard5 = new Random();
        int random5 = randomcard5.nextInt(52)+1;   //create random number 5
        
        String suitString1 = "";
        String suitString2 = "";
        String suitString3 = "";
        String suitString4 = "";
        String suitString5 = "";
        
        if (random1 >= 0 && random1 < 14) {
            suitString1 = "Diamonds";              // check which suit the card is
        }
        
        if (random1 > 13  && random1 < 27) {
            suitString1 = "Clubs";              // check which suit the card is
        }
        
        
        if (random1 > 26 && random1 < 40) {
            suitString1 = "Hearts";              // check which suit the card is
        }
        
        if (random1 > 39 && random1 < 53) {
            suitString1 = "Spades";              // check which suit the card is
        }
        
        
        
        
        
        
        
        
         if (random2 > 0 && random2 < 14) {
            suitString2 = "Diamonds";              // check which suit the card is
        }
        
        if (random2 > 13  && random2 < 27) {
            suitString2 = "Clubs";             // check which suit the card is
        }
        
        
        if (random2 > 26 && random2 < 40) {
            suitString2 = "Hearts";              // check which suit the card is
        }
        
        if (random2 > 39 && random2 < 53) {
            suitString2 = "Spades";              // check which suit the card is
        }
        
        
        
        
        
        
        
        
         if (random3 > 0 && random3 < 14) {
            suitString3 = "Diamonds";              // check which suit the card is
        }
        
        if (random3 > 13  && random3 < 27) {
            suitString3 = "Clubs";              // check which suit the card is
        }
        
        
        if (random3 > 26 && random3 < 40) {
            suitString3 = "Hearts";              // check which suit the card is
        }
        
        if (random3 > 39 && random3 < 53) {
            suitString3 = "Spades";              // check which suit the card is
        }
        
        
        
        
        
        
        
        
         if (random4 > 0 && random4 < 14) {
            suitString4 = "Diamonds";              // check which suit the card is
        }
        
        if (random4 > 13  && random4 < 27) {
            suitString4 = "Clubs";              // check which suit the card is
        }
        
        
        if (random4 > 26 && random4 < 40) {
            suitString4 = "Hearts";              // check which suit the card is
        }
        
        if (random4 > 39 && random4 < 53) {
            suitString4 = "Spades";              // check which suit the card is
        }
        
        
        
        
        
        
        
        if (random5 > 0 && random5 < 14) {
            suitString5 = "Diamonds";              // check which suit the card is
        }
        
        if (random5 > 13  && random5 < 27) {
            suitString5 = "Clubs";              // check which suit the card is
        }
        
        
        if (random5 > 26 && random5 < 40) {
            suitString5 = "Hearts";              // check which suit the card is
        }
        
        if (random5 > 39 && random5 < 53) {
            suitString5 = "Spades";              // check which suit the card is
        }
        
        
        random1 = random1 % 13;
        random2 = random2 % 13;
        random3 = random3 % 13;
        random4 = random4 % 13;
        random5 = random5 % 13;
        
        String cardString1 = ""; // string for card
        String cardString2 = ""; // string for card
        String cardString3 = ""; // string for card
        String cardString4 = ""; // string for card
        String cardString5 = ""; // string for card
        
        switch (random1) {
            
            case 1: cardString1 = "Ace";
                    break;
            
            case 2: cardString1 = "2";
                    break;
                                
            case 3: cardString1 = "3";
                    break;
                                
            case 4: cardString1 = "4";
                    break;
                                
            case 5: cardString1 = "5";
                    break;
                                
            case 6: cardString1 = "6";                   // Cases for each card
                    break;
                                
            case 7: cardString1 = "7";
                    break;
                                
            case 8: cardString1 = "8";
                    break;
                                
            case 9: cardString1 = "9";
                    break;
                                
            case 10: cardString1 = "10";
                    break;
                                
            case 11: cardString1 = "Jack";
                    break;
                                
            case 12: cardString1 = "Queen";
                    break;
                                
            case 0: cardString1 = "King";
                    break;
        }
        
        
        
        switch (random2) {
            
            case 1: cardString2 = "Ace";
                    break;
            
            case 2: cardString2 = "2";
                    break;
                                
            case 3: cardString2 = "3";
                    break;
                                
            case 4: cardString2 = "4";
                    break;
                                
            case 5: cardString2 = "5";
                    break;
                                
            case 6: cardString2 = "6";                   // Cases for each card
                    break;
                                
            case 7: cardString2 = "7";
                    break;
                                
            case 8: cardString2 = "8";
                    break;
                                
            case 9: cardString2 = "9";
                    break;
                                
            case 10: cardString2 = "10";
                    break;
                                
            case 11: cardString2 = "Jack";
                    break;
                                
            case 12: cardString2 = "Queen";
                    break;
                                
            case 0: cardString2 = "King";
                    break;
        }
        
        
        
        
        
        switch (random3) {
            
            case 1: cardString3 = "Ace";
                    break;
            
            case 2: cardString3 = "2";
                    break;
                                
            case 3: cardString3 = "3";
                    break;
                                
            case 4: cardString3 = "4";
                    break;
                                
            case 5: cardString3 = "5";
                    break;
                                
            case 6: cardString3 = "6";                   // Cases for each card
                    break;
                                
            case 7: cardString3 = "7";
                    break;
                                
            case 8: cardString3 = "8";
                    break;
                                
            case 9: cardString3 = "9";
                    break;
                                
            case 10: cardString3 = "10";
                    break;
                                
            case 11: cardString3 = "Jack";
                    break;
                                
            case 12: cardString3 = "Queen";
                    break;
                                
            case 0: cardString3 = "King";
                    break;
        }
        
        
        
        
        
        switch (random4) {
            
            case 1: cardString4 = "Ace";
                    break;
            
            case 2: cardString4 = "2";
                    break;
                                
            case 3: cardString4 = "3";
                    break;
                                
            case 4: cardString4 = "4";
                    break;
                                
            case 5: cardString4 = "5";
                    break;
                                
            case 6: cardString4 = "6";                   // Cases for each card
                    break;
                                
            case 7: cardString4 = "7";
                    break;
                                
            case 8: cardString4 = "8";
                    break;
                                
            case 9: cardString4 = "9";
                    break;
                                
            case 10: cardString4 = "10";
                    break;
                                
            case 11: cardString4 = "Jack";
                    break;
                                
            case 12: cardString4 = "Queen";
                    break;
                                
            case 0: cardString4 = "King";
                    break;
        }
        
        
        
        
        
        switch (random5) {
            
            case 1: cardString5 = "Ace";
                    break;
            
            case 2: cardString5 = "2";
                    break;
                                
            case 3: cardString5 = "3";
                    break;
                                
            case 4: cardString5 = "4";
                    break;
                                
            case 5: cardString5 = "5";
                    break;
                                
            case 6: cardString5 = "6";                   // Cases for each card
                    break;
                                
            case 7: cardString5 = "7";
                    break;
                                
            case 8: cardString5 = "8";
                    break;
                                
            case 9: cardString5 = "9";
                    break;
                                
            case 10: cardString5 = "10";
                    break;
                                
            case 11: cardString5 = "Jack";
                    break;
                                
            case 12: cardString5 = "Queen";
                    break;
                                
            case 0: cardString5 = "King";
                    break;
        }
        
        
        System.out.print(cardString1);       // print results
        System.out.println(" of "+suitString1);
        
        System.out.print(cardString2);       // print results
        System.out.println(" of "+suitString2);
        
        System.out.print(cardString3);       // print results
        System.out.println(" of "+suitString3);
        
        System.out.print(cardString4);       // print results
        System.out.println(" of "+suitString4);
        
        System.out.print(cardString5);       // print results
        System.out.println(" of "+suitString5);
        
        int count = 1;

        if (random1 == random2) {
            count = count + 1;
        }
        
        if (random1 == random3) {
            count = count + 1;
        }
                                        // compare cards to determine pairs 
         if (random1 == random4) {
            count = count + 1;
        }
        
         if (random1 == random5) {
            count = count + 1;
        }
        
        
        int count2 = 1;
        
         if (random2 == random3) {
            count2 = count2 + 1;
        }
        
         if (random2 == random4) {           // compare cards to determine pairs
            count2 = count2 + 1;
        }
        
         if (random2 == random5) {
            count2 = count2 + 1;
        }
        
        
        int count3 = 1;
        
         if (random3 == random4) {           // compare cards to determine pairs
            count3 = count3 + 1;
        }
        
         if (random3 == random5) {
            count3 = count3 + 1;
        }
        
        
        
        
        int count4 = 1;
        
         if (random4 == random5) {           // compare cards to determine pairs
            count4 = count4 + 1;
        }
        
        
        
        int pairs = 0;
        int threeofakind = 0;
        
        if (count == 2) {
            pairs = pairs + 1;              // determine how many pairs or three of a kind
        }
        
        if (count == 3) {
            threeofakind = threeofakind + 1;
        }
        
        
        
        
       if (count2 == 2) {
            pairs = pairs + 1;
        }
                                
        if (count2 == 3) {
            threeofakind = threeofakind + 1;              // determine how many pairs or three of a kind
        }
        
        
        
        
        if (count3 == 2) {
            pairs = pairs + 1;
        }
        
        if (count3 == 3) {
            threeofakind = threeofakind + 1;              // determine how many pairs or three of a kind
        }
        
        
        
        
        if (count4 == 2) {
            pairs = pairs + 1;
        }
        
        if (count4 == 3) {
            threeofakind = threeofakind + 1;              // determine how many pairs or three of a kind
        }
        
        
        
        if (threeofakind > 0) {
            pairs = pairs - 1;          // fix result issue (states three of a kind as 3 AND a pair)
        }
        
        
        if (pairs == 0 && threeofakind == 0) {
            System.out.println("You have a high card hand!");   // if no pairs, display this
        }
        
        else {
        System.out.print("You have "+pairs);
        System.out.print(" pair(s) and "+threeofakind);          //display pairs
        System.out.println(" three of a kind");
        }

    }
}

