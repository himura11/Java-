package test_B;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//　配列　宣言＆作成
		int[] result = new int[3];
		result[0] = 10; // 0番目が10
		result[1] = 9; // 1番目が9
		result[2] = 44; // 2番目が44
		for(int i=0; i<3; i++) {
			System.out.println(result[i]);
		}
		
		// 要素の上書き
		// 配列のインデックス番号を指定し、要素の上書きも可能です。
		String[] characters = {"rn","se","bn","chg"};
		characters[3] = "ki";
		System.out.println(characters[3]);
		
		
		// 要素数の取得
		// length を使用し、作成した配列の長さを取得することができます。
		String[] names = {"凛","冴","千切","氷織"};
		System.out.println(names.length);
		
		
		// 配列の結合
		// arraycopy：新しい配列にコピーしなおすという手法
		// System.arraycopy
		// ( コピー元配列変数名, コピー元の開始位置, コピー先配列変数名, コピー先の開始位置, コピーする要素の数)
		int[] src1 = {1, 2, 3, 4};
		int[] src2 = {5, 6, 7};
		int[] src3 = new int[src1.length + src2.length];
		System.arraycopy(src1, 0, src3, 0, src1.length); //空のsrc3にsrc1をコピー
		System.arraycopy(src2, 0, src3, src1.length, src2.length); //src3の後ろにsrc2をコピー
		
		
		 // String型の配列を作成して、好きなキャラを格納
		String[] favorite = {"糸師冴","糸師凛","バニー","百谷"};
		for(int i =0; i<favorite.length; i++) {
			// ループ用の変数iを0で初期化（最初は0番目から始める）
			System.out.println(favorite[i]); // i番目のキャラを取り出す
		}
		
		String[] str= {"春","夏","秋","冬"};
		// 逆から順に出力
		for(int u =str.length-1; u>=0; u--) {
			System.out.println(str[u]);
		}
		
		// 配列の結合
		String[] group1= {"糸師冴","糸師凛","氷織"};
		String[] group2= {"チカ","ナツ"};
		String[] all= new String[group1.length+ group2.length];
		
		// arraycopy：新しい配列にコピーしなおすという手法
		// System.arraycopy 
		//(コピー元配列変数名, コピー元の開始位置, コピー先配列変数名, コピー先の開始位置, コピーする要素の数)

		 System.arraycopy(group1, 0, all, 0, group1.length); //空のallにgroup1をコビー
	     System.arraycopy(group2, 0, all, group1.length, group2.length);//group1の後ろにgroup2をコピー
	     
	     for (String name : all) {
	            System.out.println(name);
	        }

	     
	     // 配列の合計
	     int[] num = {1, 2, 3, 4, 5};
	     // 合計値を入れる変数
	     int sum=0;
	     
	     // 配列の全要素を順に足していく
	     for(int o=0; o< num.length; o++) {
	    	sum += num[o]; //sum = sum + num[o];
	     }
	     System.out.println("合計値: "+sum);
	     
	     ArrayList<String> fruitList = new ArrayList<>();
	     fruitList.add("りんご");
	     fruitList.add("みかん");
	     
	// ２次元配列
	     // 配列の要素に別の配列が格納されているものを 2 次元配列といいます。
	     //2 * 3の２次元配列
	     
	     // 「2行3列の“表（たくさんの数を入れる箱）”を作る」
	     int[][] Array = new int[2][3];
	     Array[0][0] = 1; // 0行0列に1を格納
	     Array[1][2] = 3; // 1行2列に3を格納　（インデックス番号は「0」スタートなので注意)
	     
	     for (int[] row : Array) { // 各行を取り出す
	    	    for (int num1 : row) { // 各行の中の数字を取り出す
	    	        System.out.print(num1 + " ");  // 数字を表示
	    	    }
	    	    System.out.println();
	    	}
		
	    //3 * 要素数の違う２次元配列の宣言と初期化
	     //「行ごとに列の数が違う」ちょっと特別な形（“ジャグ配列”）
	     // [][] は「2次元配列」＝ 配列の中にさらに配列が入っている形
	     char[][] arr = {
	    		 {'a', 'b', 'c'}, //0行目３個
	    		 {'a', 'b', 'c', 'd'},// 1行目4個
	    		 {'a', 'b', 'c', 'd', 'e'} // 2行目５個
	     };
	     
	     for (char[] row : arr) {          // 各行を取り出す
	    	    for (char c : row) {          // 各行の中の文字を取り出す
	    	        System.out.print(c + " "); // 文字を表示
	    	    }
	    	    System.out.println();         // 行ごとに改行
	    	}
	     
	     
	     // ３次元配列
	     // 配列の要素に別の c配列が格納されているものを 3 次元配列といいます。





		
	
		

	}

}
