package coreJava;

public class Multidimensional {

	public static void main(String[] args) {
		
	/*	int a[][] =new int [2][2];
		a[0] [0] = 2;
		a[0] [1] = 4;
		a[0] [2] = 5;	
		a[1] [0] = 3;
		a[1] [1] = 4;
		a[1] [2] = 7;*/
		
		int b[][] = {{2,4,5},{3,4,7}};
		
		for(int i=0; i<2; i++)	
		{
			for(int k=0; k<3; k++)
			{
				System.out.println(b[i][k]);
			}
		}
		
		
	}

}
