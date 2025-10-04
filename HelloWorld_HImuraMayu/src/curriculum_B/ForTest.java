package curriculum_B;

public class ForTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	// While 文
		// 指定された条件が成立する(true)間、繰り返し処理を行います。
		// while(条件式 ) {
		   // 処理文; 条件式がtrueの場合、実行される}
		// whileの後の条件式は、boolean値(true,false)を返す式でないといけません。
		
		int num=0;
		while(num<5) {
			System.out.println("num>=" +num);
			num ++;
		}
		
		System.out.println("");
		
	// do-while型
		// while文と同様に指定された条件が成立する(true)間、繰り返し処理を行います。
		// while文と同様で条件式は、boolean値(true,false)を返す式ではないといけません。
		// do { 処理文;}while( 条件式 );
		
		int num1=2;
		do {
			System.out.println(num1);
			num1++;
		} while(num1<5);


		System.out.println("");

		
    // for文
		// for文も条件判定がtrueである間、繰り返し処理が実行されます。
		// while文、do-while文では、()には条件式のみ記述していましたが、
		// for文の()内では、カウント変数の宣言、初期化、条件式、カウント変数の更新を行います。
		
		// for(式1; 式2; 式3;) {
		     //処理文; }
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		 
    // 拡張for文
		// for文をさらに便利にした記述方法として、
		// 配列やコレクションの全要素を順番に取り出して処理をする場合に使用します。
		// for(変数宣言 : 参照変数名) {
	       // 処理文;}
		// numbersの要素を１つずつval変数へ代入し出力という流れを繰り返し行っています。

		System.out.println("");
		
		int[] numbers= {1,2,3,4,5};
		for(int val : numbers) {
			System.out.println(val);
		}
		
		String[] name= {"rn","se","bn"};
		for(String str : name) {
			System.out.println(str);
		}
		// 参照変数がString型の配列であるのに対して、
		// 変数宣言がint型である場合エラーになる。
		// 参照変数と各要素を受け取る変数の型は一致合わせるよう注意しましょう。
		String[] names= {"凛", "冴", "バニー"};	
		for(String f : names) {
			System.out.println(f);		
		}
		
	// 繰り返し制御文
		// 上述の繰り返し処理は、条件式がtrueの間実行され続けるというものでした
		// 特定の条件の時に繰り返し処理から抜けたいという時、
		// 繰り返し制御文であるbreak文やcontinue文を使用します。
    
	// break文
		/*
		 * 式2を書き忘れているため、条件式がありません。
		 * よって無限ループになってしまいます。
		 * しかし、if(i == 5)のブロック内にbreak;がある事で、
		 * iが5になった時ループを抜ける事になります。
		 */
		for(int i=0; ; i++) {
			if(i==5) {
			 break;
			}
			System.out.println(i);
		}
		System.out.println("終了です");
		
	// continue文
		/*
		 * 実行中の繰り返し処理を中断するのではなくその処理だけスキップして、
		 * 条件式の判定を行わせ更に繰り返し処理を続ける時に使用します。
		 */
		for(int g=0; g<10; g++) {
			if((g % 3)==1) {
				continue;
			}
			System.out.println(g);
		}
		System.out.println("終了です");
		// gを3で割って余りが1の時に処理をスキップしています。
		// (式2の条件判定がtrueである限りループは続く)
		
		
		// for 文を使って 1 から 3までの合計 を表示
		int sum=0;
		sum= sum+1;
		sum= sum+2;
		sum= sum+3;
		System.out.println(sum);
		
		// for 文を使って 1 から 10までの合計 を表示
		int total=0; // 合計を格納する変数
		for(int t=1; t<=10; t++) {
			total= total+t;
		}   System.out.println(total);
		
	// 拡張for文
		// 拡張 for 文は他の繰り返しを行う文とは異なり条件式がありません。
		// 対象となる配列やコレクションの要素の数だけ繰り返しを行います。
		String member[]= {"糸師凛", "糸師冴", "ミヒャエル・カイザー"};
		for(String str : member) {
			System.out.println(str);
		}
		
	// for文 掛け算表
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%02d * %02d = %02d", i, j, i * j);
                if (j < 9) {
                    System.out.print(" || ");
                }
            }
            // 内側のfor文が1周終わったら、改行して次の段に移ります。
            System.out.println();
           
            
           
       
		}
	}
            
        
 

		
	



    

}
