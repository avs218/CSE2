//Alex Spiezio
//Block Java Program


//  First compile the program
//      javac Block.java
    
    
//  Run the program
//      java Block//

import java.util.Scanner; //import scanner for inputs

//  define a class
public class Block {
    
    //  add main method
    public static void main(String[] args) {
        

Scanner myScanner = new Scanner( System.in ); //declare scanner

System.out.print("Enter length of block: "); // ask user length of block
int length = myScanner.nextInt(); // user input length
System.out.print("Enter width of block: "); // ask user width of block
int width = myScanner.nextInt(); // user input width
System.out.print("Enter height of block: "); // ask user height of block
int height = myScanner.nextInt(); // user input height

int surfacearea = (2 * (length * height)) + (2 * (length * width)) + (2 * (width * height)); // find surface area

System.out.print("Surface Area of Block: " +surfacearea); // ask user height of block
}
}