package lambdaexpdemo;

public class EmplyoeeExecutorUsingLambda {

	public static void main(String[] args) {
		/*implementing the functional interface-Employee using
		Lambda Expression-with No parameter*/
		/*Employee obj=()->{
			System.out.println("Lambda expression-No paramter");
		};
		obj.display();*/
		
		/*implementing the functional interface-Employee using
		Lambda Expression-with two parameter*/
		/*Employee obj=(int a,int b)->{
			
			int result=(a>b)?a:b;
			System.out.println("The maximum number is: "+result);
			return result;
			
		};
		obj.max(32,68);*/
		
		//lambda expression without return type
		Emplyoee obj=(a,b)->(a>b)?a:b;
		System.out.println("The maximum number is: "+obj.max(32,68));
		
		
	}

	}


