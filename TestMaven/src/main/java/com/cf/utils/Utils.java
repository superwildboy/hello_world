package com.cf.utils;

import java.util.Scanner;

public class Utils {
	
	public static Scanner scanner=new Scanner(System.in);
	
	public static boolean islength(String param){
		if(param.length()<20 && param.length()>6){
			return true;
		}
		return false;
	}

}
