package 데이터;

public class 기본데이터 {

	// main 함수 포함시키는거 단축키 Alt + v
	public static void main(String[] args) {
		
		// 자바는 선언할 때 데이터의 타입을 결정한다.
		
		// 문자타입 (1글자)
		char gender; // 선언) 데이터 유형 + 저장공간 이름
		
		// 숫자타입 (정수)
		int age;
		
		// 숫자타입 (실수)
		double temp;
		
		// 대입) 저장공간 이름 = 데이터 값
		gender = 'ㅇ';
		age = 100;
		temp = 25.5;
		
		// 출력, +는 결합연산자, .는 접근연산자
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("온도: " + temp);
	}
}