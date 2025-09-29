package sample;

public class BooleanExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
    // 真偽値 〜boolean〜
		// boolean b=false;
		// 比較のみ行い、true / falseを結果に表示することもできます。

		int x=5;
		int y=3;
		System.out.println(x==y);
		System.out.println(x !=y);
		System.out.println(x >=y);
		System.out.println(x+y);
		System.out.println(x-y >1);
		System.out.println(x*y >15);
		System.out.println(x/y >=7);
		
		//真偽の確認のみの場合、以下のような処理が使用でき、結果はどちらも”真”になります。
        //①三項演算子
		boolean b=true;
		int a=1;
		if(a==1 && b==true) { 
		  System.out.println("糸師冴です");
		} else if(a==1 || b==true) {// a==1かつb==trueの場合
		  System.out.println("糸師凛です");
		} else if(!(a>0)) {// a>0ではない場合
		  System.out.println("糸師兄弟です");
		} else {// if,else ifを満たさない場合
		  System.out.println("Itoshi");
		}
		
		// 三項演算子
		// 条件 ? 真の場合の値 : 偽の場合の値
		// 簡潔に条件分岐を書けますが、
		//複雑なロジックは if-else を使う方が可読性が高くなります。
	
		String isSurfable = "";
		int waveheight = 500;
		
		if (waveheight < 1000) {
			isSurfable = "OK";
		}   else {
			isSurfable ="NG";
		}
		System.out.println(isSurfable);
	}
		
		
}
