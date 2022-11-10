package inneuron;

public class A1_question3 {

	public static void main(String[] args) {
		
		int m = 14;
		int n = 7;
		int i,j;
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 | j==0 | i==m-1 | i+j<m/2 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(j=0;j<n;j++)
			{
				if(i==0  | i==m-1 | j==n-1 | i<=j)
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
