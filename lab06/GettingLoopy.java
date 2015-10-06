/*Alex Spiezio*/
/*Getting Loopy Java Program*/


/*  First compile the program*/
/*      javac GettingLoopy.java*/
    
    
/*  Run the program*/
/*      java GettingLoopy*/

import java.util.Random; //declare random number generator

//  define a class
public class GettingLoopy {
    
    //  add main method
    public static void main(String[] args) {
        
        int i = 1;
        int n = 1;
        while (i<8) {
            System.out.print(i);
            i++;
            while (i == 7 && n < 8) {
                System.out.print(i);
                n++;
            }
        }
        
        System.out.println();
        System.out.println();
        int f = 10;
        
        System.out.println("WHILE");

        while (f < 101) {
            if (f % 2 != 0 && f % 3 != 0 && f % 5 != 0 && f % 7 != 0)
            System.out.print(" "+f);
            f++;
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("FOR");
        
        for (int p = 10; p < 101; p++) {
            if (p % 2 != 0 && p % 3 != 0 && p % 5 != 0 && p % 7 != 0)
            System.out.print(" "+p);
        }
        
        System.out.println();
        System.out.println();
        int t = 10;
        
        System.out.println("DO WHILE");
    
        do { 
            if (t % 2 != 0 && t % 3 != 0 && t % 5 != 0 && t % 7 != 0)
            System.out.print(" "+t);
            t++;
        } while (t < 101);
        
        System.out.println();
        System.out.println();
        
        Random random = new Random();
        int b = random.nextInt(196)+5;
        int a = 0;
        
        while (b > 0) {
            System.out.print("ツ");
            b--;
            a++;
            if (a % 20 == 0) {
                System.out.println();
            }
        }
        
        System.out.println();
    }
}