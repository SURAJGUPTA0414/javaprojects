package Labbook.module1;

public class Exercise1{
	public static void main(String[] args) {
		int n=5;
		digit(n);
	}
	public static void digit(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i*i*i;
		}
		System.out.println("sum"+sum);
	}
	
	}


