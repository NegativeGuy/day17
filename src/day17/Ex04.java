package day17;

import java.util.ArrayList;
import java.util.HashMap;

class Test{
	private String test;
	public void setTest(String test) {
		this.test = test;
	}
	public String getTest() {
		return test;
	}
	public void display() {
		System.out.println("test 기능입니다");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		ArrayList<Test> tArr = new ArrayList<Test>();
		Test t = new Test();	// 객체 생성
		t.setTest("문자열");
		
		tArr.add(t);
		System.out.println(t);	// 확인용
		Test a = tArr.get(0);
		System.out.println(tArr.get(0));
		a.display();
		
		HashMap<String, Test> map = new HashMap<String, Test>();
		map.put("111", t);
		t = new Test();
		t.setTest("안녕하세요");
		map.put("hello", t);
		map.get("111").display();
		System.out.println(map.get("111").getTest());
		System.out.println(map.get("hello").getTest());
	}
}
