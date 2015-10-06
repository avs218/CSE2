//Alex Spiezio
//Roulette Java Program


//  First compile the program
//      javac Roulette.java
    
    
//  Run the program
//      java Roulette//

import java.util.Random; //declare random number generator

//  define a class
public class Roulette {
    
    //  add main method
    public static void main(String[] args) {
        
        Random number = new Random();
        int roulettenumber = number.nextInt(38);   //create random number 1
        switch (roulettenumber) {
            case 0: System.out.println("0");
            break;
            case 1: System.out.println("1: Red");
            break;
            case 2: System.out.println("2: Black");
            break;
            case 3: System.out.println("3: Red");
            break;
            case 4: System.out.println("4: Black");
            break;
            case 5: System.out.println("5: Red");
            break;
            case 6: System.out.println("6: Black");
            break;
            case 7: System.out.println("7: Red");
            break;
            case 8: System.out.println("8: Black");
            break;
            case 9: System.out.println("9: Red");
            break;
            case 10: System.out.println("10: Black");
            break;
            case 11: System.out.println("11: Black");
            break;
            case 12: System.out.println("12: Red");
            break;
            case 13: System.out.println("13: Black");
            break;
            case 14: System.out.println("14: Red");
            break;
            case 15: System.out.println("15: Black");
            break;
            case 16: System.out.println("16: Red");
            break;
            case 17: System.out.println("17: Black");
            break;
            case 18: System.out.println("18: Red");
            break;
            case 19: System.out.println("19: Red");
            break;
            case 20: System.out.println("20: Black");
            break;
            case 21: System.out.println("21: Red");
            break;
            case 22: System.out.println("22: Black");
            break;
            case 23: System.out.println("23: Red");
            break;
            case 24: System.out.println("24: Black");
            break;
            case 25: System.out.println("25: Red");
            break;
            case 26: System.out.println("26: Black");
            break;
            case 27: System.out.println("27: Red");
            break;
            case 28: System.out.println("28: Black");
            break;
            case 29: System.out.println("29: Black");
            break;
            case 30: System.out.println("30: Red");
            break;
            case 31: System.out.println("31: Black");
            break;
            case 32: System.out.println("32: Red");
            break;
            case 33: System.out.println("33: Black");
            break;
            case 34: System.out.println("34: Red");
            break;
            case 35: System.out.println("35: Black");
            break;
            case 36: System.out.println("36: Red");
            break;
            case 37: System.out.println("00");
            break;
        }
    }
}

System.out.println("What team won the World Cup in "+year+"?");
        String answer = scan.next();
        
        if (answer.compareTo(team)==0) {
            System.out.println("You're Right!");
        }
        
        else {
            System.out.println("You're wrong");
        }