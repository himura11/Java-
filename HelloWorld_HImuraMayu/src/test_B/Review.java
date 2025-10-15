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
		
		// 拡張for文（for-each 文）は、インデックスを意識せずに配列を処理 できます。
		int[] counts= {9,10,11,19};
		for(int num : counts) {
			System.out.println(num);
		}
		
		String name[] = {"sae", "rin", "ki"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("name[0]は"+name[0]);
		System.out.println("name[1]は"+name[1]);
		System.out.println("拡張for文");
		// 配列 name の中から1つずつ nam に取り出して使う」という意味。
		for(String nam: name) {
			System.out.println(nam);
		}
		System.out.println("オリジナル");
		
		String name1[] = {"冴", "凛", "カイザー"};
		for(int i=0; i<name1.length; i++) {
			if(name1[i].equals("冴")) {
				System.out.println("糸師冴");
			}else{
				System.out.println(name1[i]);
			}
		}
		
		int[][]Array= new int[2][3];
		Array[0][0]=10;
		Array[0][1] =20;
		Array[0][2] =30;
		Array[1][0]=40;
		Array[1][1]=50;
		Array[1][2]=60;
		// for文で出力する例
		for(int i=0; i<2; i++) { // 行
			for(int j=0; j<3; j++) { // 列
				System.out.print(Array[i][j]+" ");
			}
			System.out.println("");
		}
		
		int[][]array={{1, 2}, {3, 4}, {5, 6}};
		// 各行に2つずつ数値が入っています
		System.out.println("アクセスの仕方（例）");
		System.out.println(array[0][0]);
		System.out.println(array[0][1]);
		System.out.println(array[1][0]);
		System.out.println(array[1][1]);
		System.out.println(array[2][0]);
		System.out.println(array[2][1]);
		
		System.out.println("for文ですべて出力する例");
		for(int i=0; i<array.length;i++) {//array.length は 行数（3）
			for(int j=0; j<array[i].length; j++) {// array[i].length は 列数（2）
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][][] array1={
				{{1,2},{3,4}},
				{{5,6},{7,8}}
		};
		System.out.println("0層/0行/0列 : "+array1[0][0][0]);
		System.out.println("1層/1行/0列 : "+array1[1][1][0]);
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				for(int k=0; k<array1[i][j].length; k++) {
					System.out.println("array1["+i+"]["+j+"]["+k+"]= "+array1[i][j][k]);
				}
			}
		}
		
		String[][]arra = {
				{"🦉","🍵","🌹"}, // bll
				{"☂️","🔍","💉"}  //tgak	
		};
		
		// Java配列2次元型 
		// bll : 🦉　🍵　🌹
		// tgak: ☂️ 🔍　💉
		
		 // ブロック名の配列
		String[] nam= {"bll", "tgak"};
		// 出力
		for(int i=0; i<arra.length; i++) {
			System.out.print(nam[i]+" : "); // まずブロック名を表示
			for(int j=0; j<arra[i].length; j++) {
				System.out.print(arra[i][j]+" ");
			}
			System.out.println();
		}
		
		// 比較例
		//【基本データ型】→変数bの値を設定後に、変数aに0を代入しても変数bの値には影響なし
		int a=1;
		int b=a;
		a=0;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println();
		
     //switch文で出力 bll : 🦉　🍵　🌹
		String bll="🍵️"; // 出力したい絵文字
		  switch (bll) {
		    case "🦉":
		    	System.out.println("rn");
		    	break;
		    case"🍵":
		    	System.out.println("se");
		    	break;
		    case"🌹":
		    	System.out.println("ki");
		    	break;
		    default:
		    	System.out.println("対象外");
		}

		// tgak の3つの絵文字☂️,💉,🔍️を順番に switch 文で出力する例 
		  // tgakの絵文字配列
		  String[] tgak = {"☂️", "💉", "🔍"};
		  
		  // 配列を順番にチェック
		 for(int i=0; i<tgak.length; i++) {
			 switch(tgak[i]) {
			   case"傘":
				   System.out.println("傘です");
			   case"💉":
				   System.out.println("注射です");
			   case"🔍":
				   System.out.println("虫眼鏡です");
			 }
		 }
	}
	
}
