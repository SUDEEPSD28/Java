/*4. Write a Java program to find the numbers greater than the average 
of the numbers of a given array*/

import java.util.*;
public class prg4{
	public static void main(String[] args){
		int sum=0;int average=0;

	Scanner sc= new Scanner(System.in);
	Random rn = new Random();
	System.out.println("enter array size:\n");
	int n = sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter array elements:\n");
	for (int i=0;i<arr.length-1;i++)
	{
		arr[i]=rn.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i] + "\t");
	}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("Sum = " +sum);
		average=sum/n;
		System.out.println("Average= "+average);
		System.out.println("Numbers greater than "+average );
		for(int i=0;i<arr.length;i++){
			if(arr[i]>average)	
				System.out.print(arr[i] +"\t");
			else
				System.out.println(arr[i]+" is lesser than "+average);
		}

	}
}

	