//WAP to find duplicate value of an array

import java .util.*;
public class secPrg{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Random ran= new Random();
		System.out.println("Enter the array size \n");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("array elements \n"); 
		for(int i=0;i<arr.length;i++){
			arr[i]=ran.nextInt(n);
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +"\t");

		}
		System.out.println("Duplicate elements are");
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					System.out.println(+arr[j]);
			}
		}
	}
}