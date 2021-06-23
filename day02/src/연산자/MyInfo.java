package 연산자;

public class MyInfo {

	public static void main(String[] args) {
		
		// 이름, 나이, 키, 성별, 점심 유무
		String name = "김세영"; // 문자열
		int age = 100;
		double height = 200.8;
		char gender = 'c';
		boolean lunch = true; // false
		
		System.out.println(name);
		System.out.println(age + 1);
		System.out.println(height);
		System.out.println(gender);
		System.out.println(lunch);
		
		height = height + 10;
		System.out.println(height);
	}
}