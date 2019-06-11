package firstPackage;

public class SmallNumber {
	
	public static void main(String[] args)
	{
		int temp;
		int[] a ={1,2,3,0,4,5};
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
					
				}
				
				//System.out.println(a[i]);
			}
			
			System.out.println(a[i]);
		}
		
		System.out.println(a[0]);
		
		
	}
	
}
