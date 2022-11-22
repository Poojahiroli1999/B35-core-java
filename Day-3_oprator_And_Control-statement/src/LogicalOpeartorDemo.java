import java.util.Scanner;

public class LogicalOpeartorDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("The value of age and weight:");
		int age= s.nextInt();	
        int weight=s.nextInt();
       boolean Result=(age>18)&&(weight>50);
       System.out.println("the result is:"+Result);
       s.close();
	}     
        
}
