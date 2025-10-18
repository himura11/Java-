package test_B;

public class Person {

	// フィールド（データを入れる箱）
	private String name;
	private int age;
	
	// コンストラクタ（最初の設定 / オブジェクトを作るときに呼ばれる特別なメソッド）
	Person(String name, int age){
		this.name= name; // 左辺: オブジェクトの中の変数（フィールド）, 右辺: コンストラクトの引数
		this.age= age;
	} 
	
	// Getter（値を取り出すメソッド）
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}
