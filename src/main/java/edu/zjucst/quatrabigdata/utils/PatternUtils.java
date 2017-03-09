package edu.zjucst.quatrabigdata.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtils {
	public static String getMatchedStr(String content,String patstr){
		Pattern pattern = Pattern.compile(patstr);
		Matcher matcher = pattern.matcher(content);
		String result = null;
		if(matcher.find())
			result = matcher.group();
		return result;
	}
	
	public static List<String> getMatchedList(String content,String patstr){
		Pattern pattern = Pattern.compile(patstr);
		Matcher matcher = pattern.matcher(content);
		List<String> result = new ArrayList<String>();
		while(matcher.find())
			result.add(matcher.group());
		return result;
	}
}
