 package sample;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 5;
		x = x + 3; // xの最新値(5)に3を足して、xに再代入する
		System.out.println(x); // 出力: 8
		x += 3; // x = x + 3 と同じ
		System.out.println(x); // 出力: 11
		
		{
			int n=4;
		    n = n+6; // nの最新値（4）に6を足して、nに再代入する
		    System.out.println(n); //　出力：10
		    n += 5; // n = n + 5 と同じ
		    System.out.println (n); // 出力:15
		}
	}

}
      