package jpkg.arraygenerics;

import java.util.Arrays;

/**
 * A set of utilities for dealing with primitive arrays.
 * @author minerguy31
 *
 */
public final class ArrayGenerics {
	/**
	 * Checks if a given object is an array
	 * @param obj
	 * @return
	 */
	public static final boolean isArray(final Object obj) {
	    return obj instanceof Object[] || obj instanceof boolean[] ||
	       obj instanceof byte[] || obj instanceof short[] ||
	       obj instanceof char[] || obj instanceof int[] ||
	       obj instanceof long[] || obj instanceof float[] ||
	       obj instanceof double[];
	}
	
	/**
	 * Get the textual representation for an object
	 * 
	 * If the passed object is an array, then the corresponding Arrays.toString method is called. 
	 * Otherwise, the objects' own toString is called.
	 * @param obj
	 * @return
	 */
	public static final String genericToString(Object obj) {
		if(obj == null)
			return "null";
		else if(obj instanceof Object[])
			return Arrays.deepToString((Object[]) obj);
		else if(obj instanceof boolean[])
			return Arrays.toString((boolean[]) obj);
		else if(obj instanceof byte[])
			return Arrays.toString((byte[]) obj);
		else if(obj instanceof short[])
			return Arrays.toString((short[]) obj);
		else if(obj instanceof char[])
			return Arrays.toString((char[]) obj);
		else if(obj instanceof int[])
			return Arrays.toString((int[]) obj);
		else if(obj instanceof long[])
			return Arrays.toString((long[]) obj);
		else if(obj instanceof float[])
			return Arrays.toString((float[]) obj);
		else if(obj instanceof double[])
			return Arrays.toString((double[]) obj);
		else return obj.toString();
	}
}
