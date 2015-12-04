//Alex Spiezio
//TwoArrays Java Program


//  First compile the program
//      javac TwoArrays.java
    
    
//  Run the program
//      java TwoArrays//

import java.util.Scanner;
import java.util.Random;

//  define a class
public class TwoArrays {
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] array1 = new int[5000];
        int[] array2 = new int[5000];
        array1[0] = rand.nextInt(100001);
        array2[0] = rand.nextInt(100001);
        for (int i = 1; i < 5000; i++) {
            array1[i] = rand.nextInt(100001);
            array2[i] = rand.nextInt(100001);
            if (array2[i-1] > array2[i]) {
                array2[i] = array2[i-1] + array2[i];
            }
        }
        int max1 = 0;
        int min1 = array1[0];
        int max2 = 0;
        int min2 = array2[0];
        for (int j = 0; j < 5000; j++) { 
            if (max1 < array1[j]) {
                max1 = array1[j];
            }
        }
        for (int k = 0; k < 5000; k++) { 
            if (max2 < array2[k]) {
                max2 = array2[k];
            }
        }
        for (int l = 0; l < 5000; l++) { 
            if (min1 > array1[l]) {
                min1 = array1[l];
            }
        }
        for (int m = 0; m < 5000; m++) { 
            if (min2 > array2[m]) {
                min2 = array2[m];
            }
        }
        System.out.println("Max Array 1: "+max1);
        System.out.println("Max Array 2: "+max2);
        System.out.println("Min Array 1: "+min1);
        System.out.println("Min Array 2: "+min2);
        System.out.println("Enter a value greater than or equal to 0: ");
        int answer = scan.nextInt();
        if (answer < 0) {
            System.exit(0);
        }
        for (int n = 0; n < 5000; n++) {
            if (array2[n] == answer) {
                System.out.println("Number Found.");
                System.exit(0);
            }
        }
        System.out.println("Number not found.");
        int low = answer;
        int high = answer;
        for (int o = 0; o < 5000; o++ ) {
            if (answer < array2[o]) {
                break;
            }
            else {
                low = array2[o];
            }
        }
        for (int p = 0; p < 5000; p++ ) {
            if (high > array2[p]) {
                high = high;
            }
            else {
                high = array2[p];
                break;
            }
        }
        if (high == answer) {
            System.out.println("Number Above: none");
        }
        else {
            System.out.println("Number Above: "+high);
        }
        if (low == answer) {
            System.out.println("Number Below: none");
        }
        else {
            System.out.println("Number Below: "+low);
        }
    }
}