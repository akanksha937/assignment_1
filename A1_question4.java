package inneuron;

public class A1_question4 {

	public static void main(String [] args)
	{
		
		int m = 10;
		int i, j;
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			for(j=0;j<m;j++)
			{
				if(i+j>=m-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
