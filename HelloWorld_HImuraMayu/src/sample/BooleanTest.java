package sample;

public class BooleanTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
// 比較演算子
		int a= 10;
		int b= 5;
		System.out.println(a!=b);
		System.out.println(a==b);		
		System.out.println(a<=b);
		
// 論理演算子
		// 論理積(&&)
		// 両方がtrueのときtrue
		  boolean condition1=(10>5);
		  boolean condition2=(8<20);
		  System.out.println(condition1 && condition2);
		  
	      boolean isLogin= true;
	      if (isLogin) {
		  System.out.println("ログイン済み");
	}
	      int x = 60;
	      int y =75;
	      System.out.println("1 : (X>70 && y<=80)  =   " + (x>70 && y<=80));
	      System.out.println("2 : (x>70 || y<=80)  =   " + (x>70 || y <=80));
	      System.out.println("3 : !(x>70) = " + !(x>70));
	    		  
	  
	}
}
