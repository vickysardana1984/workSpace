//Annonymns Class : Class without a name.

//Wherever there is usage of anonnyms class there is always a chance of replacing it with lambda expression.
//But please note we cannot replace all the annonyms inner classes cannot be replaced.They are not equal.
//Annonyms inner class is more powerful than lambda expression.
//If annonyms inner class implments an interface which contains only one method, can be replaced with Lambda
public class AnnonymsInnerClass {

	/**
	 * @param args
	 */
	public static void main (String args[]) {
		//We have created an annonyms inner class(without name) which implments and interface runnable
		//and we have created an object of that. 
		Runnable r = new Runnable() {
			/* (non-Javadoc)
			 * @see java.lang.Runnable#run()
			 */
			public void run() {
				for(int i=0;i<10000;i++)
					System.out.println("i .. "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		createAnonInnerClassUsinLambda();
		
	
	}
	// Lambda expression for Anonnyms inner class.
			public static void createAnonInnerClassUsinLambda() {
				Thread t = new Thread(() -> {for(int i=0;i<20;i++)
					System.out.println("i for lambda .. "+i);});
				t.start();
				
			}
}