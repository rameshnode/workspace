/**
 * 
 */
package ramesh.kandula.demo;

/**
 * @author Golden user
 *
 */
public class Demo {

	
	public String hello(String s){
		System.out.println("Hello String s");
		return s;
	}
	
	public Object hello(Object o){
		System.out.println("Hello String object");
		return o;
	}
	
	public static void main(String args[]){
		
		Demo demo = new Demo();
		
		demo.hello(null);
	}
}
