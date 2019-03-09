import java.util.concurrent.BlockingQueue;


//Consumer to search a word in the line.

public class MultiThreadedConsumer implements Runnable {

	private BlockingQueue<String> queue;

	public MultiThreadedConsumer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		// Code to read a file.
		System.out.println("Going to read queue using Thread ..." + this.hashCode());
		String currentline = "";
		try {
			while (queue.size() != 0)
			currentline = queue.take();
			System.out.println("Queue element is " + currentline);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
