/**
 * 
 */
package ramesh.samples.threads;

import java.util.Queue;

/**
 * @author ramesh.kandula
 * 
 */
public class Producer implements Runnable {

	private Queue<Integer> queue;

	public Producer(Queue sharedQ) {
		queue = sharedQ;
	}

	/**
	 * @param args
	 */
	public void put(Integer number) {

		queue.add(number);
		notify();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (queue) {
			System.out.println("Producer started working ");
			while (queue.isEmpty()) {
				try {
					
					for (int i = 0; i < 5; i++) {
						queue.add(new Integer(i));
					}
					Thread.sleep(2000);
					System.out.println("I produced");
					queue.notify();
					
					queue.wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
