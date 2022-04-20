package ExceptionHandling;



public class Example {
	public static void main(String[] args) {
		
		try {
			
		System.out.println("start");
		int a = 10;
		int b =0;
		int c = a/b;
	
		System.out.println(c);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("you cannot divide by zero");
		}
		finally
		{
			System.out.println("im in finally");
		}
		System.out.println("end");
		
	}

}
