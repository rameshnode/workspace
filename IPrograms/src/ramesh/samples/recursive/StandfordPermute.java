/**
 * 
 */
package ramesh.samples.recursive;

/**
 * @author ramesh.kandula
 * 
 */
public class StandfordPermute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Permute ");
		RecSubsets("","abc");
	}

	public static void permute(String string) {
		permuteHelper("", string, 1);
	}

	public static void indent(int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf(".");
		}

	}

	public static void permuteHelper(String sofar, String rest, int tab) {
		indent(tab);
		if (rest.isEmpty()) {
			System.out.println(sofar);
		} else {
			for (int i = 0; i < rest.length(); i++) {
				String remaining = rest.substring(0, i) + rest.substring(i + 1);

				permuteHelper(sofar + rest.charAt(i), remaining, i);

			}
		}
	}

	static void RecSubsets(String soFar, String rest) {
		if (rest.isEmpty()) {
			System.out.println(soFar);
		}

		else {
			RecSubsets(soFar + rest.charAt(0), rest.substring(1)); // include
																	// first
																	// char
			//RecSubsets(soFar, rest.substring(1)); // exclude first char
		}
	}
}
