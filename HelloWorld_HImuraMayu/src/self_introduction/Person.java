package self_introduction;

public class Person {

	// 問題1：インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	
	// 合計人数をカウントするためのクラス変数
	private static int count = 0;
	
	// 問題2・3・4：コンストラクタを定義
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // 人数をカウント
	}
	
	 // 問題6・7：bmiメソッドを定義（戻り値double）
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

    // 問題8・9：printメソッドを定義（戻り値void）
	public void print() {
		System.out.println("名前は"+ this.name + "です。");
		System.out.println("歳は"+ this.age + "です。");
		System.out.printf("BMIは%.2fです%n", this.bmi());
	}

    // 問題10：人数の合計を表示
	public static void printCount() {
		System.out.println("合計"+ count + "人です。");
	}
}
