
 interface InterfaceDefaultMethodExample {
	
 
// void m2();
default void m1() {
	System.out.println("inside default");
	
}
}
 
 interface left {
	 
 }

public class DefaultMethodExample implements InterfaceDefaultMethodExample{ 
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		DefaultMethodExample obj = new DefaultMethodExample();
		obj.m1();
	}
	
	public void m1() {
		System.out.println("overdin implementaion...");
	}
	
}

 class DefaultMethodExample2 implements InterfaceDefaultMethodExample{ 
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		DefaultMethodExample2 obj = new DefaultMethodExample2();
		obj.m1();
		}
		
}
