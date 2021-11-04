
public class DEMO {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2 = arr1;
		arr1=new int[3];
		for(int i=1;i<arr1.length;i++)
		{
			System.out.println(arr2[i]+"");
		}
		
	}

}
