import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MultiThreadExampleMain {
	
	public static void main(String args[]) {

		BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
		System.out.println("size of queue before is " + queue.size());

		// Producer
		Thread Producer = new Thread(new MultiThreadedProducer(queue));
		Producer.start();

//		try {
//			Producer.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("size of queue after is " + queue.size());

		// Write Consumers to consume messages.
		Thread consumer = new Thread(new MultiThreadedConsumer(queue));
		consumer.start();

		Thread consumer2 = new Thread(new MultiThreadedConsumer(queue));
		consumer2.start();

	}

}
