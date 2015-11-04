/*Alex Spiezio*/
/*Shuffling Java Program*/


/*  First compile the program*/
/*      javac Shuffling.java*/
    
    
/*  Run the program*/
/*      java Shuffling*/

import java.util.Scanner; //import scanner

import java.util.Random; //import random number generator

import java.util.Arrays; //import Arrays

//  define a class
public class Shuffling {
    
    public static void printArray(String[] cards) {
        System.out.print(Arrays.asList(cards));                     //prints arrays
        System.out.println();
    }
    
    public static String[] shuffle(String[] cards) {
        Random rand = new Random();
        int x = 0;
        String hold = "";
        for (int i = 0; i < 60; i++) {
            x = rand.nextInt(51)+1;                                 //shuffles cards
            hold = cards[0];
            cards[0] = cards[x];
            cards[x] = hold;
        }
        System.out.println("Shuffled");
        return cards;
    }
    
    public static String[] randomizeHand(String[] cards) {
        System.out.println("Randomized Hand!");
        Random rand = new Random();
        int x = 0;
        String[] hand = new String[5];                              //chooses 5 random cards
        for (int i = 0; i < 5; i++) {
            x = rand.nextInt(52);
            hand[i] = cards[x];
        }
        return hand;
    }
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];               //establishes an array of 52 cards in order
        }
        printArray(cards);
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);
    }
}
