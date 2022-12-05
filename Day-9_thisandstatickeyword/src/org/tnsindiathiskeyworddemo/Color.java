package org.tnsindiathiskeyworddemo;

public class Color {
public String name;
	
	//default constructor
	Color()
	{
		this("RED");//invoking parameterized constructor
		System.out.println("Default Constructor");
	}
	//Parameterized constructor
	Color(String name)
	{
		System.out.println("The color is: "+name);
}
}
