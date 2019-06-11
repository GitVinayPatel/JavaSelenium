package firstPackage;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String a = "vinay";
		String t="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			//System.out.println(a.charAt(i));
			t=t+a.charAt(i);
			
		}
		
		System.out.println("Reverse string of " + a + " is :" + t );
		
	}

}
