package curriculum_B;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	// Q1. 
		// int 型の変数 score に 75 を代入
		// score が 60 以上なら "合格です！" と表示
		int score = 75;
		if(score>=60) {
			System.out.println("合格です！");
			}
		
	// Q2.
		// int 型の変数 age に 25 を代入
		// age が 20 以上 30 以下なら "適正年齢です" と表示
		// それ以外の場合は "対象外です" と表示

		int age=25;
	    if(20 <= age && age <= 30) {
	    	System.out.println("適正年齢です");
	    }   else {
	    	System.out.println("対象外です");
	    }
	    
	// Q3.
	    // int 型の変数 age に 18 を代入
	    // age が 20 以上なら "成人です" と表示
	    // age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
	    // age が 12 以下なら "子供です" と表示
	    
	    age = 18;
	    if(age >= 20) {
	    	System.out.println("成人です");
	    }   else if(13 <= age && age <=19){
	    	System.out.println("ティーンエイジャーです");
	    }   else if (age <= 12) {
	    	System.out.println("子供です");
	    }
	    
	// Q4.
	    // int 型の変数 x, y, z に 30, 15, 50 を代入
	    // 一番大きい数値を判定して表示
	    int x= 30;
	    int y= 15;
	    int z= 50;
	    if(z >x && z>y) {
	    	System.out.println("zは一番大きい数値です");
	    }
	    
	    
	// Q5.
	    // int 型の変数 num を用意
	    // num の値が 0 より大きければ "正の数です" と表示
	    // num の値が 0 なら "0 です" と表示
	    // num の値が 0 より小さければ "負の数です" と表示
	    int num = 0;
	    if(num>0) {
	    	System.out.println("正の数です");
	    }   else if(num == 0) {
	    	System.out.println("0です");
	    }   else if(num < 0){
	    	System.out.println("負の数です");
	    }
	    
	// Q6.
	    // int 型の変数 value を用意
	    // value が 偶数 なら "偶数です" と表示
	    // value が 奇数 なら "奇数です" と表示
	    int value = 0;
	    if (value == 0) {
	    	System.out.println("偶数です");
	    }   else if(value !=0) {
	    	System.out.println("奇数です"); 	
	    }
	 
	   
	  
	    
	// Q7.
	    // int 型の変数 score に 0 から 100 の数値を代入
	    // 90 以上なら "優"
	    // 70 以上なら "良"
	    // 50 以上なら "可"
	    // 50 未満なら "不可"　を表示
	    int score1 =49;
	    if(score1 >=90) {
	    	System.out.println("優"); 	
	    }   else if(score1 >= 70) {
	    	System.out.println("良");	
	    }   else if(score1 >= 50) {
	    	System.out.println("可");
	    }   else if(score1 < 50) {
	    	System.out.println("不可");
	    }
	    
	
	    
	// Q8.
	    // 入力が null または空文字（""）のときに「入力が無効です」と
	    // 表示する処理を作成してください
	    String str = null;
        if(str == null || str =="") {
	    	System.out.println("入力が無効です");
	    }
	    	
	    
	// Q9.
	    // int 型の変数 day を用意（1～7 の数値を代入）
	    // day の値に応じて曜日を表示
	    int day= 6;
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
		  default:
		   System.out.println("無効な数値です");
	    }
	    
	// Q10.
	    // int 型の変数 month を用意（1～12 の数値を代入）
	    // month の値に応じて季節を表示
	    // 12, 1, 2 → "冬"
	    // 3, 4, 5 → "春"
	    // 6, 7, 8 → "夏"
	    // 9, 10, 11 → "秋"
	    // それ以外の値なら "無効な月です" と表示 (※Switch文を使用してください)
	    
	    int month = 3;
	    switch(month) {
	     case 12: case 1: case 2:
	      System.out.println("冬");
	      break;
	     case 3: case 4: case 5:
	      System.out.println("春");
	      break;
	     case 6: case 7: case 8:
	      System.out.println("夏");
	      break;
	     case 9: case 10: case 11:
	      System.out.println("秋");
	     default :
	      System.out.println("無効な月です");
	    }
	}
}
