package 제어문;

import javax.swing.JOptionPane;

public class 반복문 {

	public static void main(String[] args) {
		
		for (int i=0; i<10000; i++) {
			System.out.println("내가 반복됨.");
		}
		
		JOptionPane.showInputDialog("당신의 이름은");
	}
}