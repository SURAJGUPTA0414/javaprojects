package Labbook.module1;


public class Exercise3 {
	public static void main(String[] args) {
		int i1 =1;
		int i2=1,i3;
		System.out.println(i1+" "+" ");
		for(int i=3;i<=20;i++)
		{
			i3=i1+i2;
			System.out.println(i3+" ");
			i1=i2;
			i2=i3;
		}
	}

}
