package jpkg.isarray;

import static org.junit.Assert.*;
import static jpkg.isarray.IsArray.isArray;
import jpkg.test.TestManager;

import org.junit.Test;

public class TestIsArray {
	public static void main(String[] args) {
		addTests();
		TestManager.runTests();
	}
	
	public static void addTests() {
		TestManager.addTest(TestIsArray.class);
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
