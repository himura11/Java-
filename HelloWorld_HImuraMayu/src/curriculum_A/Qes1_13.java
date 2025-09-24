 package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	// 1.
		
		// byte型の変数bを宣言
		byte b; 
		
		// short型(短整数型)の変数sを宣言
		short s; 
		
		// int型(整数型)の変数iを宣言
		int i; 
		
		// long型(長整数型)の変数lを宣言
		long l; 
		
		// float型（単精度浮動小数点数型）の変数fを宣言
		float f;
		
		// double型(倍精度浮動小数点数型)の変数dを宣言
		double d;
		
		// char型（文字型）の変数letterを宣言
		char letter;
		
		// String型(文字列型)の変数nameを宣言
		String name;
		
		// boolean型の変数isJavaFunを宣言
		boolean isJavaFun;
	
		
		
	// 2.
		
		// 初期値0で初期化
		b=0;
		System.out.println(b);
		
		// 初期値0で初期化
		s=0;
		System.out.println(s);
		
		// 初期値0で初期化
		i=0;
		System.out.println(i);
		
		// 初期値0Lで初期化
		l=0L;
		System.out.println(l);
		
		// 初期値0.0fで初期化
		f=0.0f;
		System.out.println(f);
		
		// 初期値0.0で初期化
		d=0.0;
		System.out.println(d);
		
		// 初期値\u0000で初期化
		letter='\u0000';
		System.out.println(letter);
		
		// 初期値nullで初期化
		name="null";
		System.out.println(name);
		
		// 初期値falseで初期化
		isJavaFun =false;
		System.out.println(isJavaFun);	
	
		
	// 3.
			
		// byte型の変数bに10を代入する
		b=10;
		System.out.println(b);
		
		// short型（短整数型）の変数sに100を代入する
		s=100;
		System.out.println(s);
		
		// int型（整数型）の変数iに1000を代入する
		i=1000;
		System.out.println(i);
		
		// long型（長整数型）の変数lに10000を代入する
		l=10000;
		System.out.println(l);
		
		// float型（単精度浮動小数点数型）の変数fに9.5を代入する
		f=(float) 9.5; // f=9.5;はエラーが出る→キャスト（型変換）
		System.out.println(f);
		
		// double型（倍精度浮動小数点数型）の変数dに10.5を代入する
		d=10.5;
		System.out.println(d);
		
		// char型（文字型）の変数letterにaを代入する
		letter= 'a';
		System.out.println(letter);
		
		// Spring型（文字列型）の変数nameにハローを代入する
		name="ハロー";
		System.out.println(name);
		
		// boolean型の変数isJavaFunにtrueを代入する
		isJavaFun=true;
		System.out.println(isJavaFun);
	
	// 4.
		//11110
		// short型の変数sに1110を代入する
	    //s=1110;
		//System.out.println(s);
		
		// もしくは上記で作成した変数を足す
		System.out.println(b+s+i+l);
		
		//20
		System.out.println(b*2);
		
		// a ハロー true
		System.out.println(letter+ " " + name + " " + isJavaFun);
		// char型　Spring型　boolean型を結合しても型変換なしでいいのか？
	    // 間の空白は、変数で持たず、System.out.printlnの時に、
		// 空白を文字列結合で直接記載しましょう
	    //　例：System.out.println(letter + "  " + name);
		
		
		// 11130
		// 数字を全て足す
	    System.out.println((b+s+i+l)+b*2);
		
		
		// 10000000000
		// 小数点以外の数字を全てかける
		System.out.println(b*s*i*l);
		
		// 0.105
		// 10.5割る100をする
		System.out.println(d/s);
		
		// -90
		// 10引く100をする
		System.out.println(b-s);
		
	// 5.
		/*「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。
		 * 正しく動作するように修正してください。
		 * 「+」などの操作は同じデータ型同士でないといけません。
		 * 型の違うものを演算するときは、型を変換し同じ型にしましょう。
		 * しかし、以下のような場合はString型とint型を足すと
		 * int型が自動でString型に変換され文字列の結合が行われます。（自動型変換）
		 */
		int num= 20;
		int num1 =23;
		System.out.println("ハローJSVA"+(num+num1));
		
	// 6.
		/*『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください。
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */
		
		//「初めまして山田太郎です」
		name= "山田太郎";
		System.out.println("「初めまして"+ name + "です」");
		
		//「年齢は18歳です」
		i=18;
		System.out.println("「年齢は"+ i + "歳です」");
		
		//「身長は170.5cmです」
		d=170.5;
		System.out.println("「身長は"+ d + "cmです」");
		
		// 「体重は62.5kgです」
		d=62.5;
		System.out.println("「体重は"+ d + "kgです」");
	
		// 「好きな食べ物は寿司です」
		name="寿司";
		System.out.println("「好きな食べ物は"+ name + "です」");
		
	// 7.
		//「BMIは○○です」
		// BMI= 体重（kg）÷ {身長（m)の2乗/10000.0}
		// BMIの計算式（BMIは少数第一位で表されることが多いためdouble型）
		double high = 170.5;
		double weight = 62.5;
		System.out.println(Math.ceil(weight/((high*high)/10000.0)));
		//Math.ceilで小数点一桁まで表示
		
	// 8.
		// 初めまして鈴木一郎です
		name= "鈴木一郎";
		System.out.println("初めまして"+ name + "です");
		
		// 年齢は24歳です
		i=24;
		System.out.println("年齢は"+ i + "歳です");
		
		// 身長168.5cmです
		d=168.5;
		System.out.println("身長は"+ d + "cmです");
		
		// 体重は64.2kgです
		d=64.2;
		System.out.println("体重は"+ d + "kgです");
		
		// 好きな食べ物はオムライスです
		name="オムライス";
		System.out.println("好きな食べ物は"+ name + "です");
		
		// BMIは22.6です
		   // BMI= 体重（kg）÷ {身長（m)の2乗/10000.0}
		   // BMIの計算式（BMIは少数第一位で表されることが多いためdouble型）
		double high1 = 168.5;
		double weight1 = 64.2;
		System.out.println(Math.floor(weight1/((high1*high1)/10000.0)));
		// Math.ceilで小数点一桁まで表示(小数点第一位は切り上げ)
		
	// 9.
		// 初めまして鈴木一郎です
		name= "鈴木一郎";
		System.out.println("初めまして"+ name + "です");
		
		// 年齢は48歳です
		i=24;
		i= i + 24;
		System.out.println("年齢は"+ i + "歳です");
		
		// 身長337.0cmです
		d=168.5;
		d= d + 168.5;
		System.out.println("身長は"+ d + "cmです");
		
		// 体重は128.4kgです
		d=64.2;
		d= d + 64.2;
		System.out.println("体重は"+ d + "kgです");
		
		// 好きな食べ物はオムライスです
		name="オムライス";
		System.out.println("好きな食べ物は"+ name + "です");
	
		// BMIは11.31です
		  // BMI= 体重（kg）÷ {身長（m)の2乗/10000.0}
		  // BMIの計算式（BMIは少数第一位で表されることが多いためdouble型）
		high1 = high1 + 168.5;
		weight1 =  weight1 + 64.2;
		System.out.println(Math.floor(weight1/((high1*high1)/10000)));
		
	// 10.
		// 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。
		// ただしif文は使いません
		System.out.println(i>=25);
		
	// 11.
		// 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		// int/double→String
		// String 変数 = String.valueOf(int/double型の変数);
		
		// 年齢は24歳です int→String
		i=24;
		String age= String.valueOf(i);
		System.out.println("年齢は"+ age + "歳です");
		
		// 身長168.5cmです double→String
        d=168.5;
        String height= String.valueOf(d);
	    System.out.println("身長は"+ d + "cmです");
				
		// 体重は64.2kgです double→String
		d= 64.2;
		String weigh= String.valueOf(d);
		System.out.println("体重は"+ d + "kgです");
		
		
		
	// 12.
		// 11で変換した【年齢・身長】を整数型に変換して出力してください
		
		// 24歳
		/*
		 * Stirng age="24";
		*/
		int nu= Integer.parseInt(age); // String型の変数age→int型の変数nu
		System.out.println(nu+"歳");
		
		
		// 身長168.5cm String→ int
		/* 
		String height= "168.5";
		*/
		// double mm= Integer.parseInt(height); // String型の変数height→　int型の変数mm
		// System.out.println(mm);
		
	
	// 13.
		// 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		// ただしif文は使わないでください
		int age1=25;
	    boolean isAge= (age1==25);
	    // System.out.println(isAge);
	    
	    double hight = 168.5;
	    boolean isheight= (hight >= 160);
	    // System.out.println(isheight);
	    
	    System.out.println(isAge && isheight);
	    
	}

}
  