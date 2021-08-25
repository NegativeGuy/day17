package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StInfoMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>();
		HashMap<Integer, StInfo> map = new HashMap<Integer, StInfo>();
		String name, addr;
		int age, stNum;
		
		/*
		ArrayList<String> str = new ArrayList<String>(); 
		String s = "Test";
		str.add(s);
		StInfo st = new StInfo();
		arr.add(st);
		arr.add(s);
		*/
		
		while(true) {
			System.out.println("1.학생등록 2.전체확인 3.개인정보 4.종료");
			int num = input.nextInt();
			switch(num) {
			case 1:
				StInfo s = new StInfo();//객체 생성
				System.out.println("이름 입력");
				name = input.next();
				System.out.println("나이 입력");
				age = input.nextInt();
				System.out.println("주소 입력");
				addr = input.next();
				System.out.println("학번 입력");
				stNum = input.nextInt();
				
				s.setAge(age);
				s.setName(name);
				s.setAddr(addr);
				s.setStNum(stNum);
				
				arr.add(s);
				// 위에 set한 값들을 arr에 저장				
				
				System.out.println("등록 되었습니다");
				break;
				
			case 2:
				for(int i=0; i<arr.size(); i++) {
					StInfo ss = arr.get(i);
					System.out.println("이름 : "+ss.getName());
					System.out.println("나이 : "+ss.getAge());
					System.out.println("주소 : "+ss.getAddr());
					System.out.println("학번 : "+ss.getStNum());
					System.out.println("-----------------------");
				}
				break;
				
			case 3:
				System.out.print("학번 입력 : ");
				int inStNum = input.nextInt();
				for(int i=0; i<arr.size(); i++) {
					StInfo sN = arr.get(i);

					if(sN.getStNum()==inStNum) {
						System.out.println("학번 : "+sN.getStNum());
						System.out.println("이름 : "+sN.getName());
						System.out.println("나이 : "+sN.getAge());
						System.out.println("주소 : "+sN.getAddr());
						break;
					}
				}
				break;
				
			case 4:
				System.out.println("종료합니다");
				return;
			}
		}
	}
}
