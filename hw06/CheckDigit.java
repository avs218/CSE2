/*Alex Spiezio*/
/*Check Digit Java Program*/


/*  First compile the program*/
/*      javac CheckDigit.java*/
    
    
/*  Run the program*/
/*      java CheckDigit*/

import java.util.Scanner;

//  define a class
public class CheckDigit {
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String barcode = "";
        String barcode2 = "";
        int h = 1;
        while (h == 1) {
        System.out.println("Please enter a 10 digit ISBN: ");
        barcode = scan.next();
        while (barcode.length() < 10 || barcode.length() > 10) {
            System.out.println("Invalid ISBN. ISBN must be 10 digits");
            System.out.println("Please enter a 10 digit ISBN: ");
            barcode2 = scan.next();
            barcode = barcode2;
        }
        
        int x = 0;
        int p = 10;
        int f = 0;
        int i = 0;
        
        while ( i < 9 ) {
            switch (barcode.charAt(x)) {
                case '1': f = f + (1*p);
                break;
                case '2': f = f + (2*p);
                break;
                case '3': f = f + (3*p);
                break;
                case '4': f = f + (4*p);
                break;
                case '5': f = f + (5*p);
                break;
                case '6': f = f + (6*p);
                break;
                case '7': f = f + (7*p);
                break;
                case '8': f = f + (8*p);
                break;
                case '9': f = f + (9*p);
                break;
                case '0': f = f + (0*p);
                break;
                default: System.out.println("Not a valid ISBN. Please restart the program and input 10 numbers.");
                return;
            }
            i++;
            p--;
            x++;
        }
        int t;
        switch (barcode.charAt(9)) {
                case '1': t = 1;
                break;
                case '2': t = 2;
                break;
                case '3': t = 3;
                break;
                case '4': t = 4;
                break;
                case '5': t = 5;
                break;
                case '6': t = 6;
                break;
                case '7': t = 7;
                break;
                case '8': t = 8;
                break;
                case '9': t = 9;
                break;
                case '0': t = 0;
                break;
                case 'X': t = 10;
                break;
                default: System.out.println("Not a valid ISBN. Please restart the program and input 10 numbers.");
                return;
            }

        int check = f % 11;
        if (check == t) {
            System.out.println("Valid ISBN.");
            return;
        }

        else {
            if (check == 10) {
            String iften = "X";
            System.out.println("Invalid ISBN. Check digit should be: "+iften);
            }
            else {
            System.out.println("Invalid ISBN. Check digit should be: "+check);
            }
        }
    }
}
}



