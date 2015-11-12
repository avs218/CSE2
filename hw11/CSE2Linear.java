/*Alex Spiezio*/
/*CSELinear Java Program*/


/*  First compile the program*/
/*      javac CSELinear*/
    
    
/*  Run the program*/
/*      java CSELinear*/

import java.util.Scanner; //import scanner

import java.util.Arrays;

//  define a class
public class CSE2Linear {
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] grades = new int[52];
        int x = 0;
        int t = 0;
        for (int i = 0; i < 15; i++) {
            while (t == 0) {
                System.out.println("Please enter a grade: ");
                if (scan.hasNextInt()) {
                    x = scan.nextInt();
                    if (x > 0 && x < 101) {
                        grades[i] = x;
                        System.out.print(Arrays.asList(grades));
                        t = 1;
                    }
                    else {
                        System.out.println("Error. Number out of range. Please enter again.");
                    }
                }
                else {
                    System.out.println("Error. Not an integer. Please enter again.");
                }
            }
        }
    }
}
        
        