/**
 * 
 */
package ramesh.samples.lambda;

/**
 * @author ramesh.kandula
 * 
 * 
 *         Closest product pair in an array Given an array of non negative
 *         integers and a number x, find a pair in array whose product is
 *         closest to x.
 * 
 *         Examples:
 * 
 *         Input : arr[] = [2, 3, 5, 9] x = 47 Output : {5, 9}
 * 
 *         Input : arr[] = [2, 3, 5, 9] x = 8 Output : {2, 5}
 */
public class ClosestProductPairV1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Closest product pair in an array ");

		int arr[] = new int[] { 2, 3, 5, 9 };
		int x = 10;
		int max = 0;
		int numbers[] = new int[2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i] + arr[j] > max && arr[i] + arr[j] < x) {
					max = arr[i] + arr[j];
					numbers[0] = arr[i];
					numbers[1] = arr[j];
				}
			}
		}
		System.out.println(numbers[0] + "," + numbers[1]);

	}
}