//Alex Spiezio
//Binary Converter Java Program

import java.util.Scanner;

//  define a class
public class Binary {
    
    //  add main method
    public static void main(String[] args) {


int zz;
int aa;
int bb;
int cc;


int A =	01000001;
int B =	01000010;
int C =	01000011;
int D =	01000100;
int E =	01000101;
int F =	01000110;
int G =	01000111;
int H =	01001000;
int I =	01001001;
int J =	01001010;
int K =	01001011;
int L =	01001100;
int M =	01001101;
int N =	01001110;
int O =	01001111;
int P =	01010000;
int Q =	01010001;
int R =	01010010;
int S =	01010011;
int T =	01010100;
int U =	01010101;
int V =	01010110;
int W =	01010111;
int X =	01011000;
int Y =	01011001;
int Z =	01011010;


Scanner in = new Scanner(System.in);

System.out.println("Enter Binary: ");
zz = in.nextInt();

cc = zz % 10;
aa = zz / 10;
System.out.println(+cc);

int nn;
nn=0;
int[] Array = new int[10];

while (aa >= 0.10)
{
    bb = aa % 10;
    aa = aa / 10;
    System.out.println(+bb);
    Array[nn] = bb;
    nn=nn+1;
}

}
}