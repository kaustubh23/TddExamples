package com;

public class MyHelper {

	private static final int ZERO = 0;

	public String getResult(String number) {
		String result = number;
		boolean divbyfirst = false;
		if (Integer.parseInt(number) % 3 == 0) {
			divbyfirst = true;
			result = "fuzz";
		}

		if (Integer.parseInt(number) % 5 == 0) {
			if (divbyfirst) {
				result = "fuzzbuzz";
			} else {
				result = "buzz";
			}

		}
		return result;

	}

}
