package programs;
import java.util.Scanner;
 class Triangle {
	
	    public void display(int a, int b, int c){
	        if((a+b)>c){
	            System.out.println("These are the sides of a triangle");
	        }
	        else if((a+c)>b){
	            System.out.println("These are the sides of a triangle");
	        }
	        else if ((b+c)>a){
	            System.out.println("These are the sides of a triangle");
	        }
	        else{
	            System.out.println("These are not the sides of a triangle");
	        }

	    }
class Main{
	    public static void main(String[] args) {
	        Scanner Main = new Scanner(System.in);
	        System.out.println("Enter the Sides of the Triangle: ");
	        int d = Main.nextInt();
	        int e = Main.nextInt();
	        int f = Main.nextInt();
	        Triangle n  = new Triangle();
	        n.display(d,e,f);}
	    }
 }

