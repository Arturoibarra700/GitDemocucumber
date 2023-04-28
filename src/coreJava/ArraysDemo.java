package coreJava;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[] = new int [5];//declares an array and allocates memory for the
		a[0]=2;
		a[1]=5;
		a[2]=10;
		a[3]=20;
		a[4]=12;
		
		int b[] = {1,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}

	}

}
