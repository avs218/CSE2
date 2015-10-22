/*Alex Spiezio*/
/*Area Java Program*/


/*  First compile the program*/
/*      javac Area.java*/
    
    
/*  Run the program*/
/*      java Area*/

import java.util.Scanner; //import scanner

//  define a class
public class Area {
    
    //add method for circle
    public static void circle(double pi, double radius, double area) {
        pi = 3.14; //value of pi
        area = pi * radius * radius;                                                     //equation for area
        System.out.println("");                                                              //print area
        System.out.println("Area of circle: "+area);    
        System.out.println("");
        System.exit(0);
    }
    
    //add method for triangle
    public static void triangle(double base, double height, double area) {
        area = (1/2) * base * height;                                                    //equation for area
        System.out.println("");                                                             //print area
        System.out.println("Area of triangle: "+area);
        System.out.println("");
        System.exit(0);
    }
    
    //add method for rectangle
    public static void rectangle(double length, double width, double area) {
        area = length * width;                                                           //equation of area
        System.out.println("");                                                             //print area
        System.out.println("Area of rectangle: "+area);
        System.out.println("");
        System.exit(0);
    }
    
    //add method for checking shape
    public static void check(String shape) {
        Scanner scan = new Scanner(System.in);
        if (shape.equals("circle")) {
            System.out.println("");
            int i = 0;
            double radius = 0;
            double pi = 3.14;
            double area = 0;
            while (i == 0) {
                System.out.println("Please input the radius: ");
                if (scan.hasNextDouble()) {
                    radius = scan.nextDouble();
                    scan.nextLine();
                    i = 1;
                }
                else {
                    System.out.println("Invalid measurement, please try again.");
                    System.out.println("");
                    scan.nextLine();
                }
            }
            circle(pi, radius, area);
        }
    
        else if (shape.equals("triangle")) {
            System.out.println("");
            int i = 0;
            int t = 0;
            double base = 0;
            double height = 0;
            double area = 0;
            while (i == 0) {
                System.out.println("Please input the base: ");
                if (scan.hasNextDouble()) {
                    base = scan.nextDouble();
                    scan.nextLine();
                    i = 1;
                }
                else {
                    System.out.println("Invalid measurement, please try again.");
                    System.out.println("");
                    scan.nextLine();
                }
            }
            while (t == 0) {
                System.out.println("");
                System.out.println("Please input the height: ");
                if (scan.hasNextDouble()) {
                    height = scan.nextDouble();
                    scan.nextLine();
                    t = 1;
                }
                else {
                    System.out.println("Invalid measurement, please try again.");
                    System.out.println("");
                    scan.nextLine();
                }
            }
            triangle(base, height, area);
        }
        
        else if (shape.equals("rectangle")) {
            System.out.println("");
            int i = 0;
            int t = 0;
            double length = 0;
            double width = 0;
            double area = 0;
            while (i == 0) {
                System.out.println("Please input the length: ");
                if (scan.hasNextDouble()) {                                                   //  ^^^^^^
                    length = scan.nextDouble();     
                    scan.nextLine();                                     //if and while statements check if user entered a
                    i = 1;                                                          //rectangle, triangle, or circle
                }
                else {                                                                      // vvvvvvv
                    System.out.println("Invalid measurement, please try again.");
                    System.out.println("");
                    scan.nextLine();
                }
            }
            while (t == 0) {
                System.out.println("");
                System.out.println("Please input the width: ");
                if (scan.hasNextDouble()) {
                    width = scan.nextDouble();
                    scan.nextLine();
                    t = 1;
                }
                else {
                    System.out.println("Invalid measurement, please try again.");
                    System.out.println("");
                    scan.nextLine();
                }
            }
            rectangle(length, width, area);
        }
            
        else {
            System.out.println("Invalid shape, please try again");                  //if none, ask to try again
            System.out.println("");
        }
    }
    
    //  add main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        while (true) {
            System.out.println("Please enter a shape: ");                           //while loop for user inputing shape
            String shape = scan.next();
            check(shape);
        }
    }
}
            