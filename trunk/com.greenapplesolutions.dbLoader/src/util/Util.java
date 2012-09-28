package util;

public class Util {

	public static String RelativePath;

	public static boolean isStringNullOrEmpty(String value) {
		return value == null ? true : value.trim().length() == 0 ? true : false;
	}

}
