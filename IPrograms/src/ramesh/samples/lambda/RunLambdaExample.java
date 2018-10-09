/**
 * 
 */
package ramesh.samples.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ramesh.kandula
 *
 */
public class RunLambdaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Customer> listOfCustomer = new ArrayList<Customer>();
		
		listOfCustomer.add(new Customer("ramesh","kandula",30));
		listOfCustomer.add(new Customer("suresh","xyz",22));
		listOfCustomer.add(new Customer("sri","abc",20));
		listOfCustomer.add(new Customer("raghu","qwert",38));
		listOfCustomer.add(new Customer("vijay","weerwr",40));
		
		//List<Customer> aged = listOfCustome
		listOfCustomer.stream();
		
		System.out.println(listOfCustomer);
	}

}
