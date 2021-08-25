package day17;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		ArrayList arr01 = new ArrayList();
		
		arr.add("aaa");
		arr.add("111");
		arr01.add(111);
		
		String s = arr.get(0) + "문자열 연산입니다";
		System.out.println(s);
		
		int d = (int) arr01.get(0);		
		System.out.println(d);	// 111
		System.out.println(arr01.get(0));// 111
	}
}
