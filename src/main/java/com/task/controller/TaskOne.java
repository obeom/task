package com.task.controller;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String param = sc.next();
		//String param 	= "3[a4[c]]";
		
		String result 	= "";
		int n 			= param.lastIndexOf("[");
		String str 		= param.substring(0, n+2);
		int i 			= str.length();
		while (i > 1) {
			n = str.lastIndexOf("[");
			
			char chrCnt = str.charAt(n-1);
			int cnt 	= Character.getNumericValue(chrCnt);
			char chrStr = str.charAt(n+1);
			
			String[] array = new String[cnt];
			for(int j=0; j<cnt; j++) {
				array[j] = Character.toString(chrStr) + result;
			}
			
			result = String.join("", array);
			str = str.substring(0, n-1);
			i = str.length();
		}
		
		System.out.println("result: " + result);
	}

}
