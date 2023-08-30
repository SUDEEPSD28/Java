/*
b. Modify the program seventhProgram to produce the following 
form of Floyd's triangle 
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
*/

import java.util.Scanner;

public class Prg8{
    public static void main(String[] args) {
        int n = 13;
        
        for (int i = 1; i <= n/2; i++) {
            for (int j = 1; j <= i && i + j <= n + 1; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }
}