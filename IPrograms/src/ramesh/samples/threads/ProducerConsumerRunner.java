/**
 * 
 */
package ramesh.samples.threads;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ramesh.kandula
 *
 */
public class ProducerConsumerRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue sharedQ = new LinkedList();
		
		Thread producer = new Thread( new Producer(sharedQ));
		Thread consumer = new Thread( new Consumer(sharedQ));
		
		producer.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		consumer.start();
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
