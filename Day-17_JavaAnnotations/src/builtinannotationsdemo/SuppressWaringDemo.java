package builtinannotationsdemo;

import java.util.ArrayList;

public class SuppressWaringDemo {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Object> obj=new ArrayList<>();
		obj.add(12);
		obj.add("Shiwani");
		obj.add(13.5);
		System.out.println(obj);
		
	}

	}


