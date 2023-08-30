/*Shown below is a Floyd's triangle. 
1 
2 3 
4 5 6 
7 8 9 10 
11 ... ... ... 15 . . 
79 .. .. .. .. .. .. .. .. 91

a. Write a program to print this triangle

*/

import java.util.*;

public class Prg7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number for Floyd's triangle: ");
        int n = scanner.nextInt();
        
        int num = 1;
        for (int i = 1; num <= n; i++) {
            for (int j = 1; j <= i && num <= n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
