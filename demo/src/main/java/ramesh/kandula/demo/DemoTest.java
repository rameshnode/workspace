package ramesh.kandula.demo;

import static org.junit.Assert.*;

import org.hamcrest.core.IsNull;
import org.junit.Test;

public class DemoTest {

	static Demo demo;
	public static void setup(){
		demo = new Demo();
	}
	@Test
	public void testHelloString() {
		assertTrue(demo.hello(null)==null);
	}

	@Test
	public void testHelloObject() {
		assertTrue(demo.hello("s")=="s");
	}

}
