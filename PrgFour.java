import java.util.*;
import java.io.*;


public class PrgFour{
    public static void main(String[] args) {
        System.out.println("enter a string to get it sorted");
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int length=s.length();
        // System.out.println(s.sort());

        char ar[]=s.toCharArray(); 
        

        for(int i=0;i<length-1;i++){
            for (int j=0;j<length-1;j++) {
                if(ar[j]>ar[j+1]){
                    
                    char temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        

        String sorted = new String(ar);
        System.out.println(ar);
        System.out.println(length);
    }
}