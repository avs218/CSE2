//Alex Spiezio
//Check Java Program


//  First compile the program
//      javac Check.java
    
    
//  Run the program
//      java Check//

import java.util.Scanner; //import scanner for inputs

//  define a class
public class Check {
    
    //  add main method
    public static void main(String[] args) {
        

Scanner myScanner = new Scanner( System.in ); //declare scanner

System.out.print("Enter the original cost of the check in the form xx.xx: ");// ask user for input for cost of check


double checkCost = myScanner.nextDouble(); // user input for cost of check

System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); // ask user for tip percentage
double tipPercent = myScanner.nextDouble(); // user input tip percentage
tipPercent /= 100; //convert the percentage into a decimal value

System.out.print("Enter the number of people who went out to dinner: "); // ask user number of people
int numPeople = myScanner.nextInt(); // user input number of people

// declare two variables for total cost and cost per person
double totalCost;   
double costPerPerson;

int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
totalCost = checkCost * (1 + tipPercent);
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction

dollars=(int)costPerPerson;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 

dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies); // print result

}
}
