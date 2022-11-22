import java.util.Scanner;

public class AssignmentOparatorDemo {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the value of a and b ");
		 int a=s.nextInt();
		 int b=s.nextInt();
		 a*=b;
		 b*=a;
		 System.out.println("The value of a is:"+a);
		 System.out.println("The value of b is:"+b);
		 s.close();
		 

	}

}
