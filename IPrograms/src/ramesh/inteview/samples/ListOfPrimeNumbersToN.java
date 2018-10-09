/**
 * 
 */
package ramesh.inteview.samples;

/**
 * @author ramesh.kandula
 * 
 */
public class ListOfPrimeNumbersToN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;

		boolean numbers[] = new boolean[50];
		for (int p = 2; p*p<= n; p++) {

			for (int i = p * 2; i < n; i = i+ p) {

				System.out.println(i);
				numbers[i] = true;

			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if(!numbers[i])
			System.out.print(i+ " ");
		}

	}

}
