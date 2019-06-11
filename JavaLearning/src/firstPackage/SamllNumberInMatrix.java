package firstPackage;

public class SamllNumberInMatrix {
	
	public static void main(String[] args){
		
		int[][] a= {{1,2,3},{3,4,5},{6,0,8}};
		
		int min=a[0][0];
		
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			
		}
		
		System.out.println(min);
		
		}
	

}
