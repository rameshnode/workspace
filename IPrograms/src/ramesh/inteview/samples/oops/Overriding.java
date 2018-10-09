/**
 * 
 */
package ramesh.inteview.samples.oops;

/**
 * @author ramesh.kandula
 *
 */
public class Overriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = new Dog();
		
		dog.sound();
		
		dog.type();

	}

}
class Animal{
	
	public static void sound(){
		System.out.println("ANIMAL sound");
	}
	public void type(){
		System.out.println("ANIMAL");
	}
	
	
}

class Dog extends Animal{
	public static void sound(){
		System.out.println("Dog barks");
	}
	public void type(){
		System.out.println("DOG");
	}
	
}