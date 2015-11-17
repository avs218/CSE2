/*Alex Spiezio*/
/*Transpose Java Program*/


/*  First compile the program*/
/*      javac Transpose*/
    
    
/*  Run the program*/
/*      java Transpose*/

import java.util.Scanner; //import scanner

import java.util.Random; //import random number generator

import java.util.Arrays; //import Arrays

//  define a class
public class Transpose {
    
    public static int[][] randomMatrix(int l, int w) {
        Random rand = new Random();
        int[][] matrix = new int[l][w];
        int random = 0;
        for (int i = 0; i < l; i++) {
            for (int k = 0; k < w; k++) {
                random = rand.nextInt(21)-10;
                matrix[i][k] = random;
            }
        }
        return(matrix);
    }
    
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix: ");
        System.out.println(Arrays.deepToString(matrix).replaceAll("],", "]," + System.getProperty("line.separator")));
    }
    
    public static void transposeMatrix(int[][] matrix, int l, int w) {
        for ( int c = 0 ; c < l ; c++ )
         for ( int d = 0 ; d < w ; d++ )
            matrix[c][d] = matrix[l][w];
 
      int transpose[][] = new int[w][l];
      for ( int c = 0 ; c < l ; c++ ) {
        for ( int d = 0 ; d < w ; d++ ) {            
            transpose[d][c] = matrix[c][d];
        }
      }
      System.out.println("Transpose of entered matrix:-");
 
      for ( int c = 0 ; c < w ; c++ ) {
        for ( int d = 0 ; d < l ; d++ ) {
               System.out.print(transpose[c][d]+"\t");
 
         System.out.print("\n");
        }
      }
    }
    
    //  add main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter length: ");
        int l = scan.nextInt();
        scan.nextLine();
        System.out.print("Please enter width: ");
        int w = scan.nextInt();
        printMatrix(randomMatrix(l,w));
        transposeMatrix(randomMatrix(l,w), l, w);
    }
}