package firstPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassPractise {
	
	public static void main(String[] args)
	{
		Date d = new Date();
		
		System.out.println(d.toString());
		
		System.out.println("***********************************");
		
		SimpleDateFormat d1 = new SimpleDateFormat("dd-MM-yyyy");
		
		String date=d1.format(new Date());
		
		System.out.println(date);
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
