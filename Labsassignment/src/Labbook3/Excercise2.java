package Labbook3;

public class Excercise2 {
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("EARTH");
		System.out.println(str + "|" + Excercise2.GetImage(str));
	}

	public static StringBuffer GetImage(StringBuffer str)
	{
		return str.reverse();
	}


}
