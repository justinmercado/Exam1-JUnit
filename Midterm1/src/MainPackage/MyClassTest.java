package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest extends MyClass{

	@Test
	public void test() {
		assertTrue(ReturnTrue() == true);
		assertEquals(AddTwoNumbers(2,3), 5);
	}

}
