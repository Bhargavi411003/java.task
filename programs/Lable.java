package programs;
//import java.util.Scanner;
public class Lable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j: for(int i = 0;i<10;i++) {
			for(int j = 0;j <5;j++) {
				for(int k = 0; k<3;k++) {
					if(k==2) {
						continue j; 
					}
					System.out.print("Bhargavi ");
				}
				System.out.println();
			}
			System.out.println();
		}

}
}