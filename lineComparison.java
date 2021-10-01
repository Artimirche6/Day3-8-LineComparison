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
		
		if (len1 == len2) 
		{
			System.out.println("Lines are equal");
		}
		else
		{
			System.out.println("Lines are not equal");
		}
		
	}

}
