public class lineComparison
{
	public static void main(String[] args)
	{
		int x1 = 5, x2 = 10, y1 = 6, y2 = 12;
		int x11 = 2, x22 = 4, y11 = 5, y22 = 14;
		
		int len1 = (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		int len2 = (int) Math.sqrt((Math.pow((x22-x11),2)) + (Math.pow((y22-y11),2)));
		
		System.out.println("Line Length for x1, x2, y1, y2 : "+len1);
		System.out.println("Line Length for x11, x22, y11, y22 : "+len2);
		
		Integer i1 = new Integer(len1);
		Integer i2 = new Integer(len2);
		
		int result = i1.compareTo(i2);
		
		System.out.println("Compare: "+i1.compareTo(i2));
		
		System.out.println("Equals : "+i1.equals(i2));
		
		if(result > 0)
		{  
			System.out.println("Length1 : " +i1+ " is greater than Length2 : "+i2);  
		} 
		else if(result < 0) 
		{  
			System.out.println("Length2 : " +i2+ " is greater than Length1 : "+i1);    
		} 
		else 
		{  
			System.out.println("Lines are Equals");  
		}  
	}

}
