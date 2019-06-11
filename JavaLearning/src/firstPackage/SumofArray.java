package firstPackage;

public class SumofArray {
	
	
	public static void main(String[] args)
	{
		int[] a ={1,2,3,4,5};
		
	    //another way of creating array using new keyword
		int b[] = new int[3];
	    b[0]=1;
	    b[1]=2;
	    b[2]=3;
		
		int Sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			Sum=Sum+a[i];
			
		}
		
		System.out.println("SumofArray is" +" " + Sum);
		}
		
		
}