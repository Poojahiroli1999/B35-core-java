package builtinannotationsdemo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface MyCustom
//abstract method
	String print();
	
}
class MyCustomAnnotation
{
	@MyCustom(print="C2TC-JFS")
	public void display()
	{
		System.out.println("Hey, today is the thursday.....");
	}
}
//driver class
public class CustomAnnotaionDemo {

	public static void main(String[] args) {
		MyCustomAnnotation m=new MyCustomAnnotation();
		m.display();
		Method m1=m.getClass().getMethod("display");
		MyCustom obj=m1.getAnnotation(MyCustom.class);
		System.out.println(obj.print());

	}

	}


