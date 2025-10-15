package test_B;

public class MethodTest {
	public static void main(String[] args) {
		// --- 1 ---
		printExpressionless();
		
		// --- 2 ---
		checkcharacter(19);
		checkcharacter(10);
		checkcharacter(9);
	}
	
	

	// --- 1 ---
	public static void printExpressionless() {
		System.out.println("無表情: ☂️🔍");	
	}
	// --- 2 ---
	public static void checkcharacter(int num) {
		if(num==19) {
			System.out.println("bn");
		} else if(num == 10){
			System.out.println("rn");
		} else {
			System.out.println("対象外");
		}
	}


}

	