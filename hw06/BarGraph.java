/*Alex Spiezio*/
/*Bar Graph Java Program*/


/*  First compile the program*/
/*      javac BarGraph.java*/
    
    
/*  Run the program*/
/*      java BarGraph*/

import java.util.Scanner;
import java.util.Random;

//  define a class
public class BarGraph {
    
    //  add main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            System.out.println("How much do you typically spend on a Monday?");
            double monday = scan.nextDouble();
            System.out.println("How much do you typically spend on a Tuesday?");
            double tuesday = scan.nextDouble();
            System.out.println("How much do you typically spend on a Wednesday?");
            double wednesday = scan.nextDouble();
            System.out.println("How much do you typically spend on a Thursday?");
            double thursday = scan.nextDouble();
            System.out.println("How much do you typically spend on a Friday?");
            double friday = scan.nextDouble();
            System.out.println("How much do you typically spend on a Saturday?");
            double saturday = scan.nextDouble();
            System.out.println("How much do you typically spend on a Sunday?");
            double sunday = scan.nextDouble();
            
            
            String bar1 = "";
            String bar2 = "";
            String bar3 = "";
            String bar4 = "";
            String bar5 = "";
            String bar6 = "";
            String bar7 = "";
            int x = 50;
            int i = 0;
            
            while (i < 50) {
            if (monday >= x) {
                bar1 = "xxx";
            }
            else {
                bar1 = "   ";
            }
             if (tuesday >= x) {
                bar2 = "xxx";
            }
            else {
                bar2 = "   ";
            }
             if (wednesday >= x) {
                bar3 = "xxx";
            }
            else {
                bar3 = "   ";
            }
             if (thursday >= x) {
                bar4 = "xxx";
            }
            else {
                bar4 = "   ";
            }
             if (friday >= x) {
                bar5 = "xxx";
            }
            else {
                bar5 = "   ";
            }
             if (saturday >= x) {
                bar6 = "xxx";
            }
            else {
                bar6 = "   ";
            }
             if (sunday >= x) {
                bar7 = "xxx";
            }
            else {
                bar7 = "   ";
            }
            System.out.println(bar1+"  "+bar2+"  "+bar3+"  "+bar4+"  "+bar5+"  "+bar6+"  "+bar7);
            x = x - 1;
            i++;
        }
        System.out.println(" M    T    W    R    F    S    Su");
        
        double average = (monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7;
        
        System.out.println("Your average daily expenenses are: "+average);
        
        Random rand = new Random();
        double percentage = rand.nextInt(40)+1;
        
        if (percentage > 20 && percentage < 41) {
            percentage = (percentage - 40)/100;
        }
        
        else {
            percentage = percentage / 100;
        }
        
        double averages;
        double total = average;
        int p = 0;
        
        while (p < 208) {
            averages = average * percentage;
            total += averages;
            p++;
        }
        
        System.out.println("Your expenses for 4 years: "+total);
        
        
    }
}
            