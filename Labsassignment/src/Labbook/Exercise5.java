package Labbook;


import java.util.Scanner;

public class Exercise5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.println("enter the value");
	int n = sc.nextInt();
	int d=calculatesum(n);
	System.out.println("the sum of n natural no is"+d);
	
}
public static int calculatesum(int n)
{
	int sum=0;
	for(int i=0;i<=n;i++)
		{
		if(i%3==0 || i%5==0)
		{
			sum=sum+i;
		}
		}
	return sum;
	}
}
