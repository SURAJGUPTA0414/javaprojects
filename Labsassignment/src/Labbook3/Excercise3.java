package Labbook3;

public class Excercise3 {

	  public static void main(String[] args) 
	  {StringBuffer str=new StringBuffer("JAVA");
	  
		System.out.println(str+" changed to "+Excercise3.alterString(str));
	}
	  public static StringBuffer alterString(StringBuffer str)
	  {
		  return str.replace(0,1, "M");
	  }

}
