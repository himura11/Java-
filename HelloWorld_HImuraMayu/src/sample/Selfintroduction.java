package sample;

//クラス　インスタンス　メソッド

public class Selfintroduction {
	// class部分(ファイル名と同じ)
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//メソッド部分
		
		System.out.println("Hello, java");
		//以下、画面にメッセージを表示
		
	// 氏名
	String name = "日村 真唯";
	// 年齢
	int age = 25;
	// 趣味
	String hobby = "小説を書く";
	
	
	/*
	 * 自己紹介を出力する処理
	 * 文字列名 = "日村 真唯";
	 * 整数 年齢 = 25;
	 * 文字列趣味 = "小説を書く"; 
	*/

	 
	
	System.out.println("私の名前は" + name + "です。");
	System.out.println("年齢は" + age + "歳です。");
	System.out.println("趣味は" + hobby + "ことです。" );
	
	
	
	//数値を数値として扱う場合、「""」が不要。
	System.out.println(1);
	System.out.println(2+3);
	System.out.println(2*3);
	System.out.println(4/2);
	
	//数値を文字列として扱う場合「""」が必要
	System.out.println("2+3");
	
	
	//文字列
	String message = "こんにちは";
	//文字列を出力
	System.out.println(message);
	
	//整数
	/* 
	 * int number = 100;
	　　int number1 = 10;
	
	//数値を出力
	　　System.out.println(number);
	　　System.out.println(number1);
	*/
	
	//ブール値
	boolean flag = true;
	//ブール値を出力
	System.out.println(flag);
	
	//オブジェクト
	Object obj = new Object();
	//オブジェクトを出力
	System.out.println(obj);
	
	//if文
	int number=100;
	if (number >0) {
		System.out.println("正の数です");
	}
	
	
	method1();
	
	method2();
	

	}


	public static String method1() {
		return "日村";
	}
	
	public static String method2() {
		return "真唯";
	}
	
}



