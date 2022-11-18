package Dtatypes;

import java.util.Scanner;

public class ByteDemoDataTypes {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
        
		System.out.println("Enter the number:");
        int x=s.nextInt();
        
        System.out.println("Enter the number:");
        float y=s.nextFloat();
        
        System.out.println("Enter the number:");
        char c=s.next().charAt(0);
        
        
        System.out.println("The out is:");
        System.out.println("The intger is:"+x);
        System.out.println("The decimal is:"+y);
        System.out.println("The charcater is:"+c);
        
      
        
	}

}
