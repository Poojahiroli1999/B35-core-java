package org.tnsindia;

import java.util.Scanner;

public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed of the car:");
		int speed=s.nextInt();
		
		//creation of object
		Car x=new Car();
		//compile time input
		//x.speed=45;
		x.speed(speed);
		s.close();

	}

}
	


