package sample;

public class Note {
//メソッド外
	//クラスの中にあり、メソッド外で宣言された変数をメンバ変数と呼ぶ。
	//メンバ変数には２種類あり、「クラス変数」と「インスタンス変数」がある。
	//staticあり→「クラス変数」、staticなし→「インスタンス変数」
	//staticで宣言する「クラス変数」はインスタンス化せずにアクセスすることができる
	//stataicで宣言しない「インスタンス変数」はクラスをインスタン化しないとアクセスできない
      static int num=10;
     
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//ローカル変数
		//メソッドの中だけでしか使えない
		//クラスの中にあり、メソッドの中で宣言された変数
		//一つの文の終わりには;（セミコロン）が必要
		System.out.println("こんにちは");
		
		int number = 10;
		System.out.println(number);
		
		//if文{}を使う場合、;(セミコロン)なし
		int X=5;
		if(X>0) {
			System.out.println("正の数です");
		}	//メソッド内終了、ローカル変数終了
		
		
		//インスタンス変数始まり
		//インスタンス変数（staticなしでメソッド外にある変数）
		//整数=10;
		System.out.println(number);//小文字
		//System.out.println(数値);
		
		
		//データ型
		/*
		 * int 整数 (32ビット)
		 */
		int number1=5;
		System.out.println(number1);
		
		/* 
		 * double 少数(64ビット)
		 */
		double pi =3.14;
		System.out.println(pi);
		
		/*
		 * char 文字（1文字）
		 * シングルクォーテーションで囲まれた１つの文字のみ格納する
		 */
		char letter ='A';
		System.out.println(letter);
		
		/*
		 * String 文字列（複数の文字）
		 */
		String name = "糸師冴";
		System.out.println(name);
		
		/*
		 * boolean 真偽値(true/false)
		 */
		boolean isJavaFun = false;
		System.out.println(isJavaFun);
		
		boolean isSaelike = true;
		System.out.println(isSaelike);
		
		
		//Javaでは、+演算子を使って文字列を連結できる

		//足し算
		System.out.println("計算結果:"+(4+4));//数値型なので計算される
		//文字列としての計算
		System.out.println("文字列としての計算:"+10+58);
		System.out.println("文字列としての計算:"+11+79);
		System.out.println("計算結果:"+4+4);
		System.out.println("計算結果:"+"3+5");//文字列なので計算されない
		System.out.println("計算結果:"+(3+5));
		
		
		//引き算
		System.out.println("計算結果:"+(10-5));
		System.out.println("計算結果:"+10);
		
		//掛け算
		System.out.println("計算結果:"+(2*7));
		System.out.println("計算結果:"+2*7);
		
		//割り算
		System.out.println("計算結果:"+8/2);
		System.out.println("計算結果:"+(8/2));
		
		//剰余（余り）
		System.out.println("計算結果"+5%200);
		
		
		/*型変換
		 * 値を変数に代入する時は必ず同じ型にならないというルールがある。
		 * 異なる型の値を入力する場合には、型変換を行う必要がある。
		 */
		
		/*
		 * 基本的に宣言したときと異なるデータ型の値を入力することはできません。
		 * ex int 型の変数に対して String 型の文字列を入力するとエラーになります。
		 */
		/*
		int i;
		i=「こんにちは」;
		 */
		
		
		/*
		 * しかし、int や double などの数値のデータ型の場合、
		 * 扱う範囲が広いデータ型に対して範囲が狭いデータ型の値を入力する場合はエラーになりません。
		 */
		double d;
		d=100;
		System.out.println(d);
		
		int i;
		i=10;
		System.out.println(i);
		
		String s;
		s="糸師兄弟";
		System.out.println(s);
		
		String S;
		S="sae";
		System.out.println(S);
		
		String 冴;
		冴="rnse";
		System.out.println(冴);
		
		
		//自動型変換
	
		/*
	   「+」などの操作は同じデータ型同士でないといけません。
		型の違うものを演算するときは、型を変換し同じ型にしましょう。
		しかし、以下のような場合はString型とint型を足すと
		int型が自動でString型に変換される文字列の結合が行われます。
		*/
		
		//String型+int型→int型がStirng型に変換
		System.out.println("誕生日は"+11+"月です。");
		System.out.println("誕生日は11月3日です;"+1103+"November third");
		
		
		System.out.println("糸師が好き");
		
		/*変数の種類
		 * int ・・・整数
           float・・・浮動小数点
           double・・・浮動小数点
           boolean・・・論理値
           string ・・・文字
		 */
		
		int num;
		num=3;
		System.out.println(num);
		
		System.out.println("私は" + 25 + "歳です");
		
		 System.out.println("私は今年で"+26+"歳です。");
		 
		 String na;
		 na="se";
		 System.out.println(na);
		 
		 na="rn";
		 System.out.println(na);
		 
		 //型変換
		 int nu1=15;
		 int nu2=2;
		 System.out.println(nu1/nu2);//7
		 System.out.println((double)nu1/nu2);//7.5
		 
		 
		 int ag =25;
		 System.out.println(ag);
		 
		 String nam;
		nam ="女性";
		 System.out.println("私は"+nam +"です。");
		 
		 int age=25;//変数：整数年齢
		 String nameo ="sae";//文字列名
		 
		 int age1,old,new_age;
		 age1=25;
		 old=1;
		 new_age=age1 + old;
		 System.out.println(new_age);
		 
		 int age2;
		 age2=26;
		 age2=27;
		 age2=28;
		 age2=80;
		 
		 String message;
		 message= "糸師冴";
		 //String message="糸師冴";
		 System.out.println(message);
		 
		 //変数+数値
		 int number3=20;
		 System.out.println(number3+5);
		 
		 //変数+変数
		 int number4=30;
		 System.out.println(number3+number4);
		 
		 //文字列の連結
		 String greeting="おはよう";
		  System.out.println(greeting+"兄ちゃん");
		  
		  String name1="se";
		  System.out.println(greeting+name1);
		
		  
		  String name2="rn";
		  System.out.println(name2);
		  
		  name2="糸師凛";
		  System.out.println(name2);
		  
		  //自己代入
		 int x=10;
		 System.out.println(x);
		 x=x+5;//省略x+=5
		 System.out.println(x);
		 
		 int y=8;
		 System.out.println(y);
		 y +=2;
		 System.out.println(y);
		 /*元々yという変数の中に8というデータが入っていました。
		  * そこにy+2という式で元の8に+2して代入してくださいといった感じ。
		  * プログラミングの＝は代入です。
		  */
		 
		 int u=5;
		 System.out.println(u);
		 u+=3;//←省略系　（元々：u=u+3;）
		 System.out.println(u);
		 
		 int h=6;
		 System.out.println(h);
		 h=h+1;
		 System.out.println(h);
		
		 
		 int g=9;
		 System.out.println(g);
		 g++;//省略形（元々：g=g+1, g+=1）インクリメント
		 System.out.println(g);
		
		
		int d1=50;
		System.out.println(d1);
		d1-=5;//省略形（元々d1=d1-5）
		System.out.println(d1);
		
		int o=60;
		System.out.println(o);
		o--;//省略形（o-=1;）デクリメント
		System.out.println(o);
		
		int e=120;
		System.out.println(e);
		e -=10;
		System.out.println(e);
		
		int p=4;
		System.out.println(p);
		p *=3;//p=p*3;
		System.out.println(p);
		
		int w=18;
		System.out.println(w);
		w /=2;//(←省略形：w=w/2;
		System.out.println(w);
		
		int r=10;
		System.out.println(r);
		r %=3;//（←省略形：r=r%10;
		System.out.println(r);
		
		int b;
		b=7;//int b=7;
		System.out.println(b);
		System.getProperty("line.separator");
		//自動型変換
		//「+」などの操作は同じデータ型同士でないといけません。
		//型の違うものを演算するときは、型を変換し同じ型にしましょう。
		/*しかし、以下のような場合はString型とint型を足すと
		 int型が自動でString型に変換され文字列の結合が行われます。
		*/
		
		System.getProperty("line.separator");
		System.out.println("私はが好きです。" +2025+"年から。");
		
		// 小数点弟１位まで
		System.out.println(Math.ceil(1.34));   // 2.0
	
	
		 
		 
		 
		 


		

	}

}
