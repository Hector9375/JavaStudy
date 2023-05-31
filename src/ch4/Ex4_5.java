package ch4;

import java.util.Scanner;

// 중첩 if 문 - if 문 안의 if 
					
public class Ex4_5 {

	public static void main(String... args) {
		for(String arg : args) {
			System.out.println(arg);
		}
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력해주세요.>");
		
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(100 >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score >= 94) {
				opt = '-';
			} else if (score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
			} else {
				grade = 'C';
			}
		}
		System.out.printf("당신의 학점은 %C%C 입니다.%n" , grade, opt);
	}
}


