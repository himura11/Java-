package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	// Q1. 
		// for 文を使って 1 から 10 までの数字を 1 つずつ表示
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	
		System.out.println("次はQ2です");
		
		
    // Q2.
		// for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		for(int x=2; x <=20; x += 2) {
			System.out.println(x);
		}
		
	    System.out.println("次はQ3です");
	    
	// Q3.
		//for 文を使って 10 から 1 まで カウントダウンして表示
		for(int y=10; y>=1; y --) {
			System.out.println(y);
		}
		System.out.println("次はQ4です");
		
	// Q4.
		// for 文を使って 1 から 100 までの合計 を表示
		int sum=0;
		for(int z=1; z<=100; z++) {
			sum=sum+z;
		}   System.out.println("1から100までの合計 : "+sum);
		
		System.out.println("次はQ5です");
		
	// Q5.
		// for 文を使って 以下のような三角形を出力 1,2,3,4,5
		for(int height=1; height<=5; height++) {
			for(int length=1; length<=height;length++) {
			System.out.print("*");
		    
			}
			System.out.println();
			
		}
		
		System.out.println("次はQ6です");
		
	// Q6. 
		// while 文を使って 1 から 10 までを 1 つずつ表示
		int g=1;
		while(g<=10) {
			System.out.println(g);
			g++;	
		}
		System.out.println("次はQ7です");
		
	// Q7. 
		// while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
		int k=2;
		while(k<=20) {
			System.out.println(k);
			k +=2;
		}
		System.out.println("次はQ8です");
		
	// Q8.
		// while 文を使って 10 から 1 まで のカウントダウンを表示
		int h=10;
		while(h>=1) {
			System.out.println(h);
			h--;
		}
		System.out.println("次はQ9です");
	
	// Q9.
		// while 文を使って 1 から 100 までの合計 を表示
		int total=0;
		int a =1;
		while(a<=100) {
			total= total+a;
			a++;
		}	System.out.println(total);
		System.out.println();
		System.out.println("次はQ10です");
		
		
	// Q10.
		/*
		 *  ユーザーから 数値を入力 してもらう
		 *  入力が 0 になるまで 何度でも入力を受け付ける
		 *  0が入力されたら「終了しました」と表示
		 *  ※Scannerを使用, ※While文を使用してください
		 */
		
	    /* Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("数値：");
			int number = scanner.nextInt();
			if(number == 0) {
				break; // 0が入力されたらループ終了
			}
			System.out.println(number);
		}
		System.out.println("終了しました");
		
		scanner.close(); // Scannerを閉じる
		*/
	
		System.out.println();
		System.out.println("次はQ11です");
		
		
	// Q11.
	    // for文を使用して下記の通りに出力してください
		
		//　外側のfor文：かけられる数（段）
		 for (int i = 1; i <= 9; i++) {
			 //内側のfor文：かける数（横に並ぶ数)
	         for (int j = 1; j <= 9; j++) {
	               System.out.printf("%02d * %02d = %02d", i, j, i * j);
	               if (j < 9) {
	                    System.out.print(" || ");
	                }
	            } 
	         System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("次はQ12です");
			
	
		 
	// Q12.
		 // 入力を受け取る準備
		 Scanner sc = new Scanner(System.in);
		 // ランダムな数字を作る準備
		 Random rand = new Random(); 
		 
		 //　入力を受け取る
		 System.out.println("商品名を「、」で区切って入力してください");
		 String input = sc.nextLine();
		 
		 // 入力を「、」で分ける
	     String[] items = {""};
		 
		 // テレビとディスプレイは特別ルール
		 int tv = rand.nextInt(12); // 0 から 12未満（＝11まで）の整数をランダムに出す
		 int dp = 11-tv;
		 
	
		// 入力された商品を1つずつ処理（拡張for文）
		 for(String item : items) {
			 switch (item) {
			   case "パソコン":
			   case "冷蔵庫":
			   case "扇風機":
			   case "洗濯機":
			   case "加湿器":
		         System.out.println(item +"の残り台数は"+ rand.nextInt(12)+"台数です");
		         break;
		       
			   case "テレビ":
			   case "ディスプレイ":
				 int stock = item.equals("テレビ")?tv : dp;
			     System.out.println(item + "の残り台数は"+stock+"台です");
			    
			    
			    default:
			     System.out.println("指定の商品ではありません");
		
			     
	     // Scannerを閉じる
		sc.close(); 				 
			 }
		 }
		 
		 
		 
				
		 
		 


			

	}
}
		
		
	