package programs;
import java.util.Scanner;
public class Jagged {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int [][]arr = new int [3][]; 


		arr[0]= new int [3];
		arr[1]= new int [4];
		arr[2]= new int [2];


		System.out.println("Enter " + (arr[0].length + arr[1].length+arr[2].length )+ "  element");
		for(int i=0;i<arr.length;i++)
		{
			for(int j =0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}


		System.out.println("The jagged array is :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j =0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}
}

