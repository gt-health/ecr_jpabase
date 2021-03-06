package edu.gatech.chai.ecr.jpa.json.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressUtil {
	private static final Pattern zipPattern = Pattern.compile("[0-9]{5}(?:-[0-9]{4})?");
	
	public static String findZip(String input) {
		Matcher matcher = zipPattern.matcher(input);
		if(matcher.find())
			return matcher.group();
		return "";
	}
}
