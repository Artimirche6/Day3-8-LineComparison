public class lineComparison
{
	public static void main(String[] args)
	{
		int x1 = 5, x2 = 10;
		int y1 = 6, y2 = 12;
		
		int length = (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

		System.out.println("Line Length ===> "+length);
	}
}
