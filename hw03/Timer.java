//Alex Spiezio
//Timer Java Program


//  First compile the program
//      javac Timer.java
    
    
//  Run the program
//      java Timer//

import java.util.Scanner; //import scanner for inputs

//  define a class
public class Timer {
    
    //  add main method
    public static void main(String[] args) {
        

Scanner myScanner = new Scanner( System.in ); //declare scanner

System.out.print("Enter the time of your dinner: "); // ask user time until dinner
int dinner = myScanner.nextInt(); // user input time of dinner
System.out.print("Enter the actual time: "); // ask user actual time
int time = myScanner.nextInt(); // user input actual time

int timeleft; //create variable for time until dinner

timeleft = dinner - time; // find how long until dinner

int hour = timeleft / 100;  // find hours

int minute = timeleft - (hour * 100); // find minutes

System.out.println("Dinner is in "+hour);
System.out.println("hours and "+minute);    //display result
System.out.println( "minutes");
}
}


