package firstPackage;

public class InterviewQ1 {
	
	//Find the maximum number in an matrix column where minimum number lies.
	
	public static void main (String[] args)
	{
			int[][] a= {{1,2,3},{3,0,5},{6,9,8}};
			
			int min=a[0][0];
			int minColumn = 0;
			
			for(int i =0;i<a.length;i++)
			{
				for(int j =0;j<a.length;j++)
				{
					if(a[i][j]<min)
					{
						min=a[i][j];
						minColumn=j;
					}
				}
				
			}
			
			int max=a[0][minColumn];
			int k = 0;
			while(k<3)
			{
				if(a[k][minColumn]>max)
				{
					max=a[k][minColumn];
				}
				k++;
			}
			
			System.out.println(max);
	
	
	}
		
		
		
	

}
