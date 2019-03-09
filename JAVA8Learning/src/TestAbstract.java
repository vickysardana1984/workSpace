
public abstract class TestAbstract implements testInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		//you cannot create instance of an abstract class.
		//TestAbstract obj = new TestAbstract();
	}
}

interface testInterface {
	void m1();
}
