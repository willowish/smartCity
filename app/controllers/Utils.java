package controllers;

import com.google.common.hash.Hashing;

public class Utils {
	public static String hash(String string) {
		return Hashing.sha512().hashBytes(string.getBytes()).toString();
	}
}
