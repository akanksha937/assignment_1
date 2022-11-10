package inneuron;

public class A1_question1 {

	public static void main(String[] args) {
		
		int n = 8;
		int i,j;
		
		for(i=0;i<n;i++)
		{
			// loop for I
			for(j=0;j<n;j++)
			{
				if(i==0 | i==n-1 | j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//for space
			for(j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			// loop for N
			for(j=0;j<n;j++)
			{
				if(j==0 | j==n-1 | j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}		
			}
			
			//for space
			for(j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			// loop for E
			for(j=0;j<n;j++)
			{
				if(i==0 | j==0 | i==n-1 | (i==n/2 && j<=i))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//for space
			for(j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			// loop for U
			for(j=0;j<n;j++)
			{
				if(j==0 | j==n-1 | i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}					
			}
			
			//for space
			for(j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			// loop for R
			for(j=0;j<n;j++)
			{
				if(i==0 | j==0 | i==n/2 | (i==j && i>n/2) | (j==n-1 && i<n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}			
			}
			
			//for space
			for(j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			// loop for O
			for(j=0;j<n;j++)
			{
				if(i==0 | i==n-1 | j==0 | j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//for space
			for(j=0;j<3;j++)
			{
				System.out.print(" ");
			}
			
			// loop for N
			for(j=0;j<n;j++)
			{
				if(j==0 | j==n-1 | j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}		
			}
			System.out.println();
		}
		
	}

}
