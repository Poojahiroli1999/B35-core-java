import java.util.Scanner;

public class RelationalOpeartorDemo {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a=s.nextInt();
        int b=s.nextInt();
        boolean result=a>b;
        System.out.println("the result is:"+result);
        s.close();

	}
	}
