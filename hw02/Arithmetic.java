//Alex Spiezio
//Arithmetic Java Program


//  First compile the program
//      javac Arithmetic.java
    
    
//  Run the program
//      java Arithmetic//


//  define a class
public class Arithmetic {
    
    //  add main method
    public static void main(String[] args) {
        
    //  Add new item: milk
    // note item cost
    double milk = 3.50;
    
    //  Add new item: cereal
    // note item cost
    double cereal = 2.50;
    
    //  Add new item: milk
    // note item cost
    double icecream = 4.50;
    
    //  Add new item: milk
    // note item cost
    double chocolatesyrup = 2.15;
    
    //  Add new item: milk
    // note item cost
    double chickenwings = 14.75;
    
    //  Create variable for sum of items
    // Sum equals total price of items without tax 
    double sum = milk + cereal + icecream + chocolatesyrup + chickenwings;
    
    // print sum
    System.out.println("Total Cost of Items: $"+sum);
    
    //  Create new variable for tax
    // Tax equals 6 % of sum
    double tax = sum * .06;
    
        // print tax
    System.out.println("Total Sales Tax: $"+tax);
    
    //  Create new variable for Total with tax
    // Total with Tax equals sum plus tax
    double TotalwTax = sum + tax;
    
            // print total with tax
    System.out.println("Total including Tax: $"+TotalwTax);
    
    }
    
}