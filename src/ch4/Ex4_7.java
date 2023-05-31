package ch4;

// Math.random();

public class Ex4_7 {

	public static void main(String[] args) {
		// Math.random() - 0.0과 1.0 사이의 임의의 double 값을 반환
		// (int)(Math.random() * 3)을 하면 정수로 변환. 0 ~ 2    0,1,2
		// (int)(Math.random() * 3) + 1; 1 ~ 3    1,2,3
		
		int num = 0;
		
		for (int i = 1; i <= 20; i++) {
			System.out.println((int)(Math.random() * 10) +1) ;
		}
	}	
}
