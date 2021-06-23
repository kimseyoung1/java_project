package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		
		// 변수 (variable): 램에 만들어지는 저장공간. 이 값은 변할 수 있다. 변수 하나에 값 하나만 저장
		// 예약어(class, char, int... 이런 것들)로 변수명 설정 불가
		// 변수 선언하기 전에 변수에 값 대입하면 에러남. 당연함.
		// 웬만하면 변수명에 언더바도 안 붙이는 것 추천 (카멜표기법 사용) / 언더바 사용하는 것은 파이썬에서 많이 사용 (뱀표기법)
		char color;
		int num;
		double avgAge;
		
		color = 'r';
		num = 709;
		avgAge = 27.5;
		
		System.out.println("색: " + color);
		System.out.println("호실: " + num);
		System.out.println("평균나이: " + avgAge);
	}
}

/* 
 * 한줄 복붙: ctrl + alt + 화살표 아래
 * 한줄 이동: alt + 화살표 위아래
 * 한줄 삭제: ctrl + d
 */