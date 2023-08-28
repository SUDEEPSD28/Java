
//WAP to convert min into days and year
import java.util.*;
public class Prg1{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		long min;
		char ch;
		do
		{
			System.out.println("enter the minutes:\n");
		min=sc.nextLong();
		System.out.println("Total minutes is "+min);
		calculateYearDay(min);
		System.out.println("print y to continue program\n");
		ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');

	}
	static void calculateYearDay(long min)
	{
	int Year,Days;
	Year=(int)(min/365*12*24*60);
	Days=(int)(min/24*60);
	System.out.println("min in year is"+Year);
	System.out.println("min in days is"+Days);
	}

}