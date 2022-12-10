package exceptiondemo;

import java.io.IOException;
import java.util.Scanner;

public class ThrowKeywordsDemo {
	public Scanner s;

	public class ThrowsKeywordDemo {
		
		public void print(int x) throws IOException 
		{
			if(x==1)
			{
				System.out.println("it is equal");
			}
			else
				throw new IOException("IOException Occurred");
		}

	public void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		System.out.println("Enter the input for x:");
		int x=s.nextInt();
		try
		{
			print(x);
		}
		
		catch(Exception  e)
		{
			System.out.println(e);
		}
	}
	}
}
		

