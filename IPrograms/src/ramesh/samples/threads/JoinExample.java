/**
 * 
 */
package ramesh.samples.threads;

/**
 * @author ramesh.kandula
 * 
 */
public class JoinExample {

	public static void main(String args[]) {

		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread 1 Started ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1 ends");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Thread 2 Started ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2 ends");
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				System.out.println("Thread 3 Started ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 3 ends");
			}
		};

	
		t1.run();
		t1.start();
		t1.start();
			
			/*t1.start();
			while(t1.isAlive()){
				
				
			}
			t3.start();
			while(t3.isAlive()){
				
			}t2.start();
*/


		

	}

}
