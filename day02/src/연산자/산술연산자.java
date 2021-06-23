package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {

		// 산술연산자: 사칙연산자(+, -, *(애스터리스크), /), %(나머지)
		int x = 100;
		int y = 200;
		
		System.out.println("합: " + (x + y));
		System.out.println("차: " + (x - y));
		System.out.println("곱: " + (x * y)); // 얘네는 우선순위가 곱, 나누기, 나머지가 먼저이기 때문에 괄호 안해도 되긴 함. 근데 명시적으로 클리어코드를 위해 괄호 넣는게 좋음.
		System.out.println("나누기: " + (x / y));
		System.out.println("나머지: " + (x % y));
	}
}