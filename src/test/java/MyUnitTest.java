package test.java;
import helloWorld.hello;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void test() {
	hello myUnit = new hello();

        String result = myUnit.printhello();

        assertEquals("Hello World", result);
	}

	
}
