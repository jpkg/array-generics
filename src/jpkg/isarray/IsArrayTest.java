package jpkg.isarray;

import static org.junit.Assert.*;
import static jpkg.isarray.IsArray.isArray;
import jpkg.test.TestManager;

import org.junit.Test;

public class IsArrayTest {
	public static void main(String[] args) {
		test();
		TestManager.runTests();
	}
	
	public static void test() {
		TestManager.addTest(IsArrayTest.class);
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
