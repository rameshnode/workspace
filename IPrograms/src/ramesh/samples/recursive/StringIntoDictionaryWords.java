/**
 * 
 */
package ramesh.samples.recursive;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ramesh.kandula
 * 
 */
public class StringIntoDictionaryWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StringIntoDictionaryWords test");
		Set<String> dictionary = new HashSet<String>();
		dictionary.add("I");
		dictionary.add("Ramesh");
		dictionary.add("am");

		String string ="IRamesh";
		for (int i = 0; i < string.length(); i++) {
			
			System.out.println("string.substring(i,string.length()) "+string.substring(i,string.length()));
			recursiceDictionaryWords(string.substring(i,string.length()), dictionary);
		}
		
	}

	public static void recursiceDictionaryWords(String string,
			Set<String> dictionary) {
		// TODO Auto-generated method stub
		System.out.println("-->" + string);
		if (string.isEmpty()) {
			System.out.println(string);
		}
		if (dictionary.contains(string)) {
			System.out.println(string);

		} else {
			if(string.length()!=1)
			recursiceDictionaryWords(string.substring(0, string.length() - 1),
					dictionary);
		}

	}

}
