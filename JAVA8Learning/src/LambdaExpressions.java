
public class LambdaExpressions {
	
	public static void main(String args [] ) {
		//Create a lambda expression, save it in a functional interface refrence.
		//Call the method using the refrence of the functional interface
		test t1 =() -> System.out.println("Hello");
		t1.firstAbstractMethod();
		interf t2 = s ->  s.length();
		int length = t2.getlength("vishal");
		System.out.println("length is "+ length);
		
		//Start a new thread for runnable and print my name 100 times in a seperate thread
		Runnable r = () -> {for(int i=0;i<200;i++)
							System.out.println("Child thread");};
				Thread childThread = new Thread(r);
				childThread.start();
				
		for(int i=0;i<200;i++)
			System.out.println("Main thred");
		
	}
	
	public void  printHello() {
		System.out.println("Hello");
	}
	
}



 // This is a functional interface since it is SAM.If by mistake i make this a non functional interface
// compiler will give an error.
@FunctionalInterface 
 interface test {
	 public void firstAbstractMethod();
	 //Any number of default and static methods can be defined.
	 default void m1() {
		 
	 }
	 default void m2() {
	 }
	 static void m3() {
	 }
	
}


interface interf {
	public int getlength(String s);
}

