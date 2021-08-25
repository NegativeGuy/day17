package day17;

import java.util.ArrayList;

class Print02<T>{
	// 클래스명 뒤 <>안에 임의의 자료형(예시에선 T)을 넣어줌
	public void test(T n1, T n2) {
		// 그럼 이제부터는 어떤 자료형이던 받을 수 있는 파라미터를 만들 수 있음
		System.out.println(n1+","+n2);
		System.out.println(n1.getClass());
		// getClass()는 현재 참조하고 있는 클래스를 보여주는 매서드
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Print02<Double> dou = new Print02<Double>();
		// 객체를 생성할 때 <>안에 자료형을 넣어주면
		// 위의 T가 넣어준 자료형으로 대입된다
		dou.test(1.11, 2.222);
		
		Print02<String> str = new Print02<String>();
		str.test("aa", "bb");
		
		Print02<Integer> in = new Print02<Integer>();
		in.test(10, 20);
	}
}
