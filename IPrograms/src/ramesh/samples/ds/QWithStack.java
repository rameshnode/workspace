/**
 * 
 */
package ramesh.samples.ds;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author ramesh.kandula
 * 
 */
public class QWithStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q<Integer> numbers = new Q<Integer>();

		numbers.enqueue(1);
		numbers.enqueue(2);
		numbers.enqueue(3);
		numbers.enqueue(4);

		// System.out.println("b get "+ numbers.stack.pop());
		numbers.dequeue();
		numbers.dequeue();
		// System.out.println("a get "+ numbers.stack.pop());
	}

}

class Q<T> {

	public Stack<T> stack = new Stack<T>();

	public T enqueue(T item) {
		return stack.push(item);

	}

	public void dequeue() {
		System.out.println(getFirst(stack, 4));
	}

	public T getFirst(Stack<T> stack, int call) {

		T t = null;
		if (stack.size() > 1) {
			t = stack.pop();
			call = call - 1;
			
			getFirst(stack, call);
			
		} else {
			System.out
					.println(" met base condition so the last " + stack.pop());
			t = stack.pop();
		}
		
		return t;
		

	}
}
