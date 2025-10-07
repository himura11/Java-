package test_B;

public class Review {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {9,10,19,44};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("numbers["+i+"]="+numbers[i]);
		}
		
		
	// 糸師→冴か凛、バニー→19と出力するコード
		// キャラクター名を配列に入れる
		String names[] = {"糸師", "バニー", "冴", "凛"};
		
		// for文で1つずつ取り出す
		for(String name :names) {
			// 条件分岐で出力を変える
			if(name.equals("糸師")) {
				System.out.println("冴 or 凛");
			} else if(name.equals("バニー")) {
				System.out.println("19");
			} else {
				System.out.println("対象外");
			}
		}
		
		
		//配列を順番に表示するJavaの例
		String characters[] = {"冴", "凛", "バニー", "カイザー"};
		for(int i=0; i<characters.length; i++) { //配列の長さより小さい間、ループを続ける
			System.out.println(characters[i]);
		}
		
		

	}
}
