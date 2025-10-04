package curriculum_B;

public class WhileTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		int num = 1;
		while(num<5) {
			System.out.println(""+num);
			num++;
		}
		
		int count=0;
		while(count<=4){
		System.out.println("カウント"+count);
		count++;
		}
	
	// while 文を使って 1 から 5までの合計 を表示
		int sum=0; //　合計を格納する変数
		int i= 1; // 加算する変数（開始値）
		
	    while(i<=5) {
	    	sum = sum+i; // sumに現在のiの値を加算する
	    	i++; // iを1増やす
	    }   System.out.println(sum);
	    
	 // do-while文
	    int account=1;
	    do {
	    	System.out.println("アカウント"+account);
	    	account++;
	    }   while(account<=5);
	    
	 int total=0;
	 total=total+1;
	 total=total+2;
	 total=total+3;
	 total=total+4;
	 System.out.println(total);
	 
	 // Scannerクラスの作成
	  // Scannerの作成
	    /*Scanner scanner= new Scanner(System.in); // Scannerの作成
	    
	    System.out.println("あなたの名前を入力してください");
	    String name = scanner .next();// ユーザーの入力を取得
	    System.out.println("こんにちは、"+name+"さん！");
	   
	   
	    scanner.close();// Scannerを閉じる
	    */
	    
	    
	    
	    for (int i1 = 1; i1 <= 9; i1++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%02d * %02d = %02d", i1, j, i1 * j);
                if (j < 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
		  
	    }
	    
	    
    
	}

}
