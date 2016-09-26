package jpkg.arraygenerics;

public final class ArrayGenerics {
	public static final boolean isArray(final Object obj) {
	    return obj instanceof Object[] || obj instanceof boolean[] ||
	       obj instanceof byte[] || obj instanceof short[] ||
	       obj instanceof char[] || obj instanceof int[] ||
	       obj instanceof long[] || obj instanceof float[] ||
	       obj instanceof double[];
	}
}
