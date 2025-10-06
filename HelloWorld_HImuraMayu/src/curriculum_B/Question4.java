package curriculum_B;

import java.util.Arrays;

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
		
		

	}

}
