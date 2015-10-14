/*Alex Spiezio*/
/*Twisty Java Program*/


/*  First compile the program*/
/*      javac Twisty.java*/
    
    
/*  Run the program*/
/*      java Twisty*/

import java.util.Scanner; //import scanner

//  define a class
public class Twisty {
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); //declare scanner
        int i = 0; //initialize counter
        int length = 0; //initialize variable
        int width = 0; //initialize variable
        while (i == 0) {
            System.out.println("Enter a length: ");
            if (scan.hasNextInt()) {                                
                length = scan.nextInt();
                i++;                                                            //input length loop
            }                                                                       //if incorrectly subitted, try again
            else {
                System.out.println("Not a valid integer. Please try again.");
                scan.nextInt();
            }
        }
        
        int t = 0; //initialize counter
        
        while (t == 0) {
            System.out.println("Enter a width: ");
            if (scan.hasNextInt()) {
                width = scan.nextInt();                                                            //input width loop
                t++;                                                                                //if incorrectly subitted, try again
                if (width >= (length)) {
                    System.out.println("Width must be smaller than length. Please try again.");
                    t--;
                }
            }
            else {
                System.out.println("Not a valid integer. Please try again.");
                scan.next();
            }
        }
        
        for (int x = 0; x < width; x++) {               //loop for how many rows
            for (int y = 0; y < length; y++) {                  //loop for how long each row is
                if ( y % width == x) {                      
                    if ( width % 2 == 1 ) {                             
                        if ( x % 2 == y % 2 ) {
                            System.out.print("#");
                        }
                        else {
                            System.out.print("\\");
                        }
                    }
                    else {
                        if ( ( (y / width) % 2 ) == 0 ) {
                            System.out.print("#");      
                        }
                        else {
                            System.out.print("\\");
                        }
                    }
                }                                                       //execution of algorithm to 
                else if ( y % width == width - (x + 1) ) {              //create two looping curves
                    if ( width % 2 == 1 ) {
                        if ( x % 2 == y % 2 ) {
                            System.out.print("/");
                        }
                        else {
                            System.out.print("#");
                        }
                    }
                    else {
                        if ( ( (y / width) % 2 ) == 0 ) {
                            System.out.print("/");      
                        }
                        else {
                            System.out.print("#");
                        }
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
        System.out.println("");                                     //shift down to start next line
        }
    System.out.println("");                                 //create a space between inputs and design
    }
}