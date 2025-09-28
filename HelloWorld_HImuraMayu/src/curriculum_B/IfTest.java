package curriculum_B;

public class IfTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// if文
		// if 文は 条件が true のときにだけ処理を実行します。
		// If文が実行されるif文の例
		int score = 85; 
		// if (条件式) {　条件が true の場合に実行される処理　}
		if(score >= 80) {System.out.println("合格です !");}
		
		// else,　else if
		// if だけではなく、else を使うと、
		// 条件に当てはまらなかった場合の処理を指定できます。
		score=65;
		if(score >= 80) {System.out.println("合格です!");}
		else if(score >= 60){System.out.println("追試です!");}
		// else {　どの条件にも当てはまらない場合の処理}
		else{System.out.println("不合格です");}
		
		
		// 比較演算子
		// 比較演算子を使うと 2つの値を比較し、結果が true か false になります。
		int a= 10;
		int b=5;
		if(a > b) {System.out.println("a は b より大きい");}
		if(a==10) {System.out.println("a は 10です");}
		
		// 論理演算子
		// 論理演算子は、複数の条件を組み合わせる 場合に使います。
		int age = 25;
		boolean hasTicket = true;
		
		// AND（&&）：両方の条件を満たす場合
		if(age >= 18 && hasTicket){System.out.println("入場できます");}
		
		// OR（||）：どちらかの条件を満たす場合
		if(age >=18 || hasTicket) {System.out.println("一部の条件を満たしています");}
		
		// NOT（!）：条件を反転
		if(! hasTicket) {System.out.println("チケットがありません");}
		
		
		//条件演算子（三項演算子）
		// 三項演算子（? :）を使うと、簡単な if ～ else を 1行で書ける ため便利です。
		score =85;
		String result;
		if(score >= 80) {result="合格";}else {result="不合格";}      
		System.out.println(result);
		
		// 上記を下記に書き換えられる
		//変数 = (条件式) ? 真の場合の値 : 偽の場合の値;
		
		
		
		// switch文
		// switch 文は式を評価した値を、複数候補と比較して一致したラベルへ
		// 処理を移すことができます

		int i=2;
		switch (i) {
		  case 1:
			  System.out.println("case 1実行"); // iが1の場合に実行される処理
			  break;
		  case 2:
			  System.out.println("case 2実行"); // iが2の場合に実行される処理
			  // break;
		  case 3:
			  System.out.println("case 3実行"); // case2にbreakがないためここも実行される
			  break;
		}

		
		
		// switch文
		// switch 文は 複数の条件分岐 をシンプルに書ける制御構造です。
		int day =3; // 曜日を表す（1=月曜日,2=火曜日,,,7=日曜日）
		switch(day) {
		  case 1:
		   System.out.println("今日は月曜日です");
		   break;
		  case 2:
		   System.out.println("今日は火曜日です");
		   break;
		  case 3:
		   System.out.println("今日は水曜日です");
	       break;
		  case 4:
		   System.out.println("今日は木曜日です");
		   break;
		  case 5:
		   System.out.println("今日は金曜日です");
		   break;
		  case 6:
		   System.out.println("今日は土曜日です");
		   break;
		  case 7:
		   System.out.println("今日は日曜日です");
		   break;
		  
		}
		
		// 三項演算子
		// 条件式の結果に応じた式を実行する演算子です。
		// 条件式? 式1:式2
		// 条件式がtrueを返した場合は式1を実行し、falseを返した場合は式2を実行します。
        // 例えば、条件式がtrueの場合。
		String name="糸師";
		String str="名前の長さは";
		str += name.length()>=4? "4以上です":"3以下です";
		System.out.println(str);
		
		
		
		
		
		
		// 繰り返し処理
	    // 指定した回数や条件式が真となっている間、ブロック内の処理を繰り返し行います
		
		int h=0;
		System.out.println("h>=0" +h);
		h += 1;
		System.out.println("h>=0" +h);
		h +=1;
		System.out.println("h>=0" +h);
		
		// for(式1; 式2; 式3;){
		// 処理文
	    //}
		// ・式1で繰り返し回数を示す変数(カウンタ変数)を宣言、初期化。
		// ・式2で条件判定を行う。
		// ・条件判定がtrueの場合、処理文が実行される。
		// ・処理が実行された後、式3でカウンタ変数の更新が行われる。
		// ・再び式2で条件判定を行う。
		// ・式2での判定がfalseの場合、for文を終了する。

		for (int j=0; j<5; j++) {
			System.out.println("j>=0" +j);
		}
		
	
		
		

		

		
		


		

			
		
		
	}

}
