package test_B;

import java.util.Random;
import java.util.Scanner;

public class Sample2_14_Q12 {

	public static void main(String[] args) {
	
		// TODO 自動生成されたメソッド・スタブ
		
		// ①キーボードから文字を入力できるようにする命令
		// System.in は「キーボード入力（標準入力）」を意味する
		// sc は自分でつけた変数名（好きな名前でOK、一般的に sc や scanner を使う
		Scanner sc= new Scanner (System.in);
		
		System.out.println("好きなキャラクターを入力してください：");
		
		//　入力した文字列を受け取る
		String name= sc.nextLine();
		
		System.out.println("入力ありがとうございます");
		
		// ②ランダム（＝ランダムな数値、いわゆる「くじ引き」や「サイコロ」）を作るための命令
		Random rand= new Random();
		// 0~11のランダムな整数
		int num = rand.nextInt(12);
		System.out.println(num);
	}
	}


