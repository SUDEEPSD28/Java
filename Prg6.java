//Write a Java program to move every positive number to the 
//right and every negative number to the left of a given array of integers.*/
import java.util.Scanner; 

public class Prg6{
 public static void main(String[] args) {
  int temp=0,i;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the array size");
  int n = sc.nextInt();
  int arr[]= new int[n];
  System.out.println("Enter the array elements");
  for(i=0;i<n;i++){
   arr[i]=sc.nextInt(); 
  }
  for(i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
     if (arr[i]>arr[j]){
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
     } 
    }
  }
  System.out.println("Array elements :");
  for(i=0;i<n;i++){
   System.out.print(arr[i] +" ");
  }

 }
}