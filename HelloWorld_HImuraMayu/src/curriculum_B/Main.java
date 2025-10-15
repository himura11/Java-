package curriculum_B;

public class Main {

	public static void main(String[] args) {
	
    // --- Q4 ----	
		// インスタンスを作る
		Greeting g = new Greeting();
		// インスタンス経由で呼ぶ
		g.sayHello();
		
		
    // --- Q5 ----
		// Animalクラスを使うために宣言する
		Animal animal = new Animal(); // ここから処理が始まる！
		
		// setterで値を入れる    
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);
		
		// getterで値を取り出して表示   
		System.out.println("動物名 : "+ animal.getName());
		System.out.println("体重 : " + animal.getLength()+ "m");
		System.out.println("速度 : "+ animal.getSpeed()+"km/h");
	}
}
