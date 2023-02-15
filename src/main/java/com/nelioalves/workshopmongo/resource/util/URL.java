package com.nelioalves.workshopmongo.resource.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class URL {
	
	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	public static LocalDate convertDate(String textdate, LocalDate defaultValue) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try {
			return LocalDate.parse(textdate, fmt1);
		} catch (DateTimeParseException e) {
			return defaultValue;
		}
		
		
	}

}
