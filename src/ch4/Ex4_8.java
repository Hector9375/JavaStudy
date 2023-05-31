package ch4;


// for 문 

public class Ex4_8 {

	public static void main(String[] args) {
		int i;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("i="+i);
		}
		System.out.println(i);
		
		
		// 조건식을 생략하면, true로 간주되어서 무한반복문이 
		// for(;true;) {
	}

}
