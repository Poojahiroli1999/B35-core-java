package InheritanceDemo;

import java.util.Scanner;
//driver class for single-inheritance
public class SingleInheritaceDemo {
public static void main(String[] args) {
		
		System.out.println("Enter the name of the animal:");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		System.out.println("Enter the breed of the animal:");
		String breed1=s.nextLine();
		
		Dog d=new Dog();
		d.name=name1;
		d.breed=breed1;
		d.display();
		d.print();

}
		
		
}

