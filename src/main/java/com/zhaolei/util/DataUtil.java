package com.zhaolei.util;

import java.security.MessageDigest;

public class DataUtil {

	public static String MD5(String password) {
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest b = MessageDigest.getInstance("md5");
			byte[] n = b.digest(password.getBytes());
			for (byte b1 : n) {
				sb.append(b1);
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
