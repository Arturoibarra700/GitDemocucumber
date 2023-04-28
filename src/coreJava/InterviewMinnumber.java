package coreJava;

public class InterviewMinnumber {

	public static void main(String[] args) {

		
		int a[][] = {{2,4,5},{3,2,10},{1,2,0}};
		
		int smallest=a[0][0];
		int mincoloumn =0;
		
		for(int i=0; i<3; i++)
		{
			
			for(int j=0; j<3; j++)
			{
				if (a[i][j] < smallest) 
				{
					smallest = a[i][j]; 
					mincoloumn =j;
					
				}
				
			}
			
		}
		int max=a[0][mincoloumn];
		int k=0;
		while(k<3)
		{
			if(a[k][mincoloumn]>max)
			{
				max=a[k][mincoloumn];
			}
			k++;
			
		}
		
		System.out.println("The smallest number is "+smallest);
		System.out.println("The bigges number is "+max);
	}

}
