package Labbook.module1;


import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		System.out.println("select on light");
		System.out.println("1.Red");
		System.out.println("2.Yellow");
		System.out.println("3.Green");
		
		System.out.println("Enter the choice");
		Scanner Sc = new Scanner(System.in);
		int choice = Sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Stop");
		break;
		case 2:System.out.println("ready to go");
		break;
		case 3:System.out.println("go now");
		break;
		}
		
	}

}
