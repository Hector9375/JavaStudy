package ch4;


// 중첩 for 문 
public class Ex4_10 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
			System.out.println("haha");
		}
	}

}
