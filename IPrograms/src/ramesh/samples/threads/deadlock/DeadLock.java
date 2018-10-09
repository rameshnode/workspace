/**
 * 
 */
package ramesh.samples.threads.deadlock;

/**
 * @author ramesh.kandula
 *
 */
public class DeadLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer printer = new Printer();
		PrinterThread printer1 = new PrinterThread("primary", printer);
		PrinterThread printer2 = new PrinterThread("secondary", printer);
		
		printer1.start();
		try {
			printer1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printer2.start();
	}
	
	

}
class PrinterThread extends Thread {
	Printer printerObj;
	
	public PrinterThread(String name, Printer printer){
		super(name);
		printerObj = printer;
	}
	public void run(){
		System.out.println(" Thread "+ Thread.currentThread().getName() +" started processing");
		
		if(Thread.currentThread().getName().equalsIgnoreCase("primary")){
			synchronized(printerObj){
				Thread.currentThread().suspend();
			}
		}
	}
}
