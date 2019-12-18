public class IndexOf {
	public static void main(String[] args) {
		String x = "aaabb";
		String y = "bb";
		String z = null;
		//System.out.println(firstIndexOf(z, x));
		//System.out.println(lastIndexOf(x, y));
	}


	public static int firstIndexOf(String x, String y) {
		if (isValid(x, y)) {
			return indexOf(x, y, 0, x.length(), true);
		} else {
			//System.out.println("invalid");
			return -1;
		}
	}


	public static int lastIndexOf(String x, String y) {
		if (isValid(x, y)) {
			return indexOf(x, y, x.length() - y.length(), 0, false);
		} else {
			//System.out.println("invalid");
			return -1;
		}
	}

	private static int indexOf(String x, String y, int start, int end, boolean forward) {
		for (int i = start; i != end; i += forward ? 1 : -1) {
			String substring = x.substring(i, i + y.length());
			//System.out.println("testing substring from " + i + " to " + i + y.length() + " " + substring);
			if(substring.equals(y)) {
				return i;
			}
		}
		//System.out.println("Not in String");
		return -1;
	}

	private static boolean isValid(String x, String y) {
		return x != null && y != null;
	}
}




