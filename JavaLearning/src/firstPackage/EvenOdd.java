package firstPackage;

public class EvenOdd {
	
	int[] a ={1,2,3,4,5};
	
	public static void main (String[] args){
		
		int[] a ={1,2,3,4,5};
		
		for(int i=0;i<=a.length-1;i++){
			
			if(a[i]%2==0){
			System.out.println(a[i]+"is even");
			}
			else{
				System.out.println(a[i]+"is odd");
			}
			
		}
		
		
		
	}
	
	
	

}
