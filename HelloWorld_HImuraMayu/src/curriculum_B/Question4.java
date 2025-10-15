package curriculum_B;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	// Q1.
		// int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する
		// 配列の全要素を 順番に表示
		int[] numbers = {1,2,3,4,5};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);	
		}
		
	// Q2.
		// int 型の配列 {10, 20, 30, 40, 50} を用意する
		// 配列の要素を 逆順 に表示　
		int[] scores = {10,20,30,40,50};
		System.out.println("逆順で出力");
		for(int i= scores.length-1; i>=0; i--) {
			System.out.println(scores[i]);
		}
		
		
	// Q3.
		// int 型の配列 {3, 5, 7, 9, 11} を用意する
		// 配列の全要素の 合計値 を計算し、表示
		int[] num = {3, 5, 7, 9, 11};
		// 合計値を入れる変数
		int sum = 0;
		// 配列の全要素を順に足していく
		for(int i=0; i< num.length; i++) {
			sum += num[i];// sum = sum + num[i];
		}
		System.out.println("合計値：" + sum);
		
		
		
	// Q4.
		// int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		// 配列の 最大値と最小値 を求めて表示
		int[] numb = {12, 7, 9, 21, 5, 18};
		
		int max = Arrays.stream(numb).max().getAsInt();
		int min = Arrays.stream(numb).min().getAsInt();
		
		System.out.println("最大値: "+ max);
		System.out.println("最小値: "+ min);
		
	// Q5.
		// int 型の配列 {1, 2, 3, 4, 5} を用意する
		// 配列のすべての要素を 2 倍 し、結果を表示
		// 結果を表示する際の処理に拡張for文を使用してください
		
	int[] counts = {1, 2, 3, 4, 5};
		
		// すべての要素を2倍にする（普通のfor文で処理）
		for(int i= 0; i<counts.length; i++) {
			counts[i] = counts[i]*2; // i番目の要素に（元の値×2）を代入する
		}
		
		// 結果を拡張for文で表示
		for(int count:counts) {
			System.out.println(count);
		}
		
	// Q6.
		// int 型の配列 {4, 7, 10, 15, 20} を用意する
		// ユーザーが入力した数が 配列に含まれているか を判定し、結果を表示
		// 結果：（”入力した値”は配列に含まれています／含まれていません）
		
		int[] nums = {4, 7, 10, 15, 20};
		
		// ユーザーから入力を受け取る
		Scanner sc = new Scanner(System.in); // ユーザーから入力を受け取る準備
		System.out.println("入力してください");
		 int input= sc.nextInt();
		System.out.println(input);
		 
		// 配列に含まれているかを調べるためのフラグ
		boolean found = false; // 最初は「見つかっていない」
		
        // for文で配列の中身を順にチェック
		for(int i= 0; i<nums.length; i++) {
			if(nums[i] == input) {
				found = true;
				break; // 見つけたらループを終了
			}
		}
		// 結果を表示
		if(found) {
			System.out.println(input + " は配列に含まれています。 ");
		    }else {
				System.out.println(input+ " は配列に含まれていません。 ");
			}
		sc.close(); 
		
		System.out.println("次はQ7です");
		
	// Q7.
		// 2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する
		// 配列の すべての要素を表示 
		int[][] array = {
				{1, 2}, 
				{3, 4}, 
				{5, 6}
				};
		for(int i=0; i< array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

		
	// Q8. 
		// 2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
		// 配列の すべての要素の合計値を表示
		int[][] array1= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		int sum1=0;// 合計を入れる変数
	
		// すべての要素を取り出して表示
		for(int i=0; i<array1.length; i++) { // 行のループ
			for(int j = 0; j<array1[i].length; j++) { // 列のループ
				System.out.print(array1[i][j]+" ");
				sum1 += array1[i][j]; // → sum = sum + array[i][j]; と同じ意味
				                      //→ 「今までの合計 sum に、今の要素 array[i][j] を足す」
			}
			System.out.println();
		}
		System.out.println("合計値 : "+sum1);
		
	// Q9. 
		// 2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
		// 配列内の 最大値と最小値 を求めて表示
		int[][]array2= {
				{12,15,8},
				{6,19,25},
				{30,2,10}
		};
		
		int max1 =array2[0][0];  // 最大値の初期値
		int min1 =array2[0][0];  // 最小値の初期値
		
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				if(array2[i][j]>max1) {
					max1= array2[i][j]; // 最大値更新
				}
				if(array2[i][j]<min1) {
					min1= array2[i][j]; // 最小値更新
				}
			}
		}
		System.out.println("最大値: "+max1);
		System.out.println("最小値: "+min1);
	
		
	// Q10.
		// 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
		// 配列内のすべての要素を 表示
		int[][][]array3= {
			{{1,2}, {3,4}},
			{{5,6}, {7,8}}
		};
		
		// 3重ループで全要素を表示
		for(int i=0; i<array3.length; i++) {
			for(int j=0; j<array3[i].length; j++) {
				for(int k=0; k<array3[i][j].length; k++) {
					System.out.print(array3[i][j][k]+" ");
				}
			}
			System.out.println(); // ブロックごとに改行
		}
	}
}
