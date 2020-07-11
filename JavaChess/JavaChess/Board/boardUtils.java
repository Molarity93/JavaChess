package Board;

public class boardUtils {
	
	public static final boolean[] FIRST_COLUMN = null;
	public static final boolean[] SECOND_COLUMN = null;

	private boardUtils() {
		throw new RuntimeException("You cannot instantiate me!");
	}
	
	public static boolean isValidTitleCoordinate(int coordinate) {
			return coordinate >=0 && coordinate < 64;
	}

}
