/**
 * 
 */
package ramesh.samples.threads.deadlock;

/**
 * @author ramesh.kandula
 *
 */
public class Printer {

	public synchronized void print(String message){
		System.out.println(Thread.currentThread().getName() +" printing "+message);
	}

}