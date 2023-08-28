//WAp to find kth largest and smallest element in an array

import java.util.*;
public class prg3{
	public static void main(String[] args){
		int arr[]={2,3,9,11,14,24,28,99,99};
		int k=1;
		if(k<1||k>arr.length){
			System.out.println("invalid array:\n");
		return;}
	int smallest = kSmallestElement(arr,k);
	int largest =kLargestElement(arr,k);
	System.out.println(" kth smallest element:"+smallest);
	System.out.println(" kth largest element:"+largest);
}
public static int kSmallestElement(int[]arr,int k)
{
	Arrays.sort(arr);
	return arr[k-1];
}
public static int kLargestElement(int []arr,int k)
{
	Arrays.sort(arr);
	return arr[arr.length - k];
}
}
