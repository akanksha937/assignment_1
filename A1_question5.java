package inneuron;

public class A1_question5 {

	public static void main(String[] args) {
		
		int m = 10;
		int n = 5;
		int i, j;
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				if(i==0 | j==0 | i+j<m )
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
				if(i==0)
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				if( j==0 | i==m-1 | i>=j )
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
				if(i==m-1)
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		
	}

}
