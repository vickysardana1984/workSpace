import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;


public class MultiThreadedProducer implements Runnable {

	private BlockingQueue<String> queue;

	public MultiThreadedProducer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		// Code to read a file.
		System.out.println("Going to read a file...");
		String line = null;
		try {
			FileInputStream fin = new FileInputStream(
					"C:\\Users\\vishal.sardana\\Documents\\workspace-spring-tool-suite-4-4.0.0.RELEASE\\JAVA8Learning\\src\\testReadFile.txt");
			BufferedReader buff = new BufferedReader(new InputStreamReader(fin));
			try {

				while ((line = buff.readLine()) != null) {
					System.out.println("line is " + line);
					try {
						queue.put(line);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				buff.close();
				fin.close();
				System.out.println("closing thread...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
