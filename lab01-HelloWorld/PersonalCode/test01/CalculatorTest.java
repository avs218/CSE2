//Alex Spiezio
//Calculator Java Program

import java.util.Scanner;


//  define a class
public class CalculatorTest {
    
    //  add main method
    public static void main(String[] args) {
        
int s;
int x;
int y;
int z;

Scanner in = new Scanner(System.in);
      
System.out.println("Would you like to add to:");
System.out.println("1: Add");
System.out.println("2: Subtract");
System.out.println("3: Multiply");
System.out.println("4: Divide");
s = in.nextInt();
if(s == 1) {
    System.out.println("Enter first Number: ");
    x = in.nextInt();
    System.out.println("Enter second Number: ");
    y = in.nextInt();
z = x + y;
    System.out.println("Your Answer is: " +z);
        }
if(s == 2) {
    System.out.println("Enter first Number: ");
    x = in.nextInt();
    System.out.println("Enter second Number: ");
    y = in.nextInt();
z = x - y;
    System.out.println("Your Answer is: " +z);
        }
if(s == 3) {
    System.out.println("Enter first Number: ");
    x = in.nextInt();
    System.out.println("Enter second Number: ");
    y = in.nextInt();
z = x * y;
    System.out.println("Your Answer is: " +z);
        }
if(s == 4) {
    System.out.println("Enter first Number: ");
    x = in.nextInt();
    System.out.println("Enter second Number: ");
    y = in.nextInt();
z = x / y;
    System.out.println("Your Answer is: " +z);
        }
    }
}