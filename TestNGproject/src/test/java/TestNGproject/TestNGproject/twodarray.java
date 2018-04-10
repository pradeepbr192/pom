package TestNGproject.TestNGproject;

public class twodarray {

public static void main(String args[]) {
	String x[] [] = new String[3][5];
	System.out.println(x.length);
	System.out.print(x[0].length);


for(int row=0;row<x.length;row++)
{
	for(int column=0;column < x[0].length;column++)
	{
		
		System.out.println(x[row][column]);
	}
		}
}

}

