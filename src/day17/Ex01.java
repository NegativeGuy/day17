package day17;
class Print{
	public void test(double n1, double n2) {
		System.out.println(n1+","+n2);
	}
	public void test(String n1, String n2) {
		System.out.println(n1+","+n2);
	}
	public void test(int n1, int n2) {
		System.out.println(n1+","+n2);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Print dou = new Print();
		// print 클래스로 dou 객체 생성
		dou.test(1.11, 2.222);
		Print str = new Print();
		str.test("aa", "bb");
		Print in = new Print();
		in.test(10, 20);
	}
}
