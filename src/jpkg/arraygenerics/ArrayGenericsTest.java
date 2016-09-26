package jpkg.arraygenerics;

import static org.junit.Assert.*;
import static jpkg.arraygenerics.ArrayGenerics.isArray;
import jpkg.test.TestManager;

import org.junit.Test;

public class ArrayGenericsTest {
	public static void main(String[] args) {
		test();
		TestManager.runTests();
	}
	
	public static void test() {
		TestManager.addTest(ArrayGenericsTest.class);
	}
	
	@Test
	public void testObj() {
		assertFalse(isArray(null));
		assertFalse(isArray(1));
		assertFalse(isArray("test"));
		assertTrue(isArray(new int[] {}));
		assertTrue(isArray(new String[] {}));
		assertTrue(isArray(new Object[] {null, null}));
	}
}
