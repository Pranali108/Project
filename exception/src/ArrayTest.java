import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		a = sc.nextInt();
		System.out.println("Enter the number of columns");
		b = sc.nextInt();
		
		int arr[][] = new int[a][b]; 
		System.out.println("Enter the elements of array");
		
		for(int i=0; i<a; i++)
		{
			for(int j =0; j<b; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array elements are");
		
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
