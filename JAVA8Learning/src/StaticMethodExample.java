
public class StaticMethodExample implements  interfStaticMethodExample{
	public static void main (String args[]) {
		
		StaticMethodExample obj = new StaticMethodExample();
		//obj.m1();  // This will give compilation error
		//StaticMethodExample.m1() //This will also not work
		interfStaticMethodExample.m1(); // this will work fine.
		
	}

}

interface interfStaticMethodExample {
	public static void m1() {
		System.out.println("inside static m1 of interface");
	}
}