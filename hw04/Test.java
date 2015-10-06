import java.util.Random; //declare random number generator
import java.util.Scanner;

//  define a class
public class Test {
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phone number in the form XXX-XXX-XXXX: ");
        String number = scan.next();
        int x = 0;
        int i = 0;
        int n = 0;
        char c;
        for (int m = 0; m < 12; m++) {
        switch (number.charAt(x)) {
            case '1': i = 1;
            n = 9;
            break;
            case '2':
            case 'A': 
            case 'B':
            case 'C': i = 2;
            n = 9;
            break;
            case '3':
            case 'D': 
            case 'E':
            case 'F': i = 3;
            n = 9;
            break;
            case '4':
            case 'G': 
            case 'H':
            case 'I': i = 4;
            n = 9;
            break;
            case '5':
            case 'J': 
            case 'K':
            case 'L': i = 5;
            n = 9;
            break;
            case '6':
            case 'M': 
            case 'N':
            case 'O': i = 6;
            n = 9;
            break;
            case '7':
            case 'P': 
            case 'Q':
            case 'R':
            case 'S': i = 7;
            n = 9;
            break;
            case '8':
            case 'T': 
            case 'U':
            case 'V': i = 8;
            n = 9;
            break;
            case '9':
            case 'W': 
            case 'X':
            case 'Y':
            case 'Z': i = 9;
            n = 9;
            break;
            case '0': i = 0;
            n = 9;
            break;
            default: c = '-';
            System.out.print(c);
            n = 10;
            break;
        }
        if (n<10) {
        System.out.print(i);
        }
        x++;
        }
        System.out.println("");
                
    }
}
        
        