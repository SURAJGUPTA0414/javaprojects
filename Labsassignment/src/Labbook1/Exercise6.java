package Labbook1;

import java.util.Scanner;

public class Exercise6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
	int a=calculateDifference(n);
	System.out.println("the value is "+a);
	
}
public static int calculateDifference(int n)
{
int sum1=0, sum2=0;
for(int i=0;i<=n;i++)
{
sum1=sum1+i*i;
sum2= sum2 + i;
}
sum2=sum2*sum2;
int sum=sum1-sum2;
return sum;
}
}
