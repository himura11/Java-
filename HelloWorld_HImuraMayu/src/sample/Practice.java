 package sample;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
			int x = 5;
		    x = x + 3; // xの最新値(5)に3を足して、xに再代入する
		    System.out.println(x); // 出力: 8
		    x += 3; // x = x + 3 と同じ
		   System.out.println(x); // 出力: 11
		
		
		
			int n=4;
		    n = n+6; // nの最新値（4）に6を足して、nに再代入する
		    System.out.println(n); //　出力：10
		    n += 5; // n = n + 5 と同じ
		    System.out.println (n); // 出力:15
		
		
		
			//　自動変換（int→double,小→大）
			int a= 10;
			double b=a;
			System.out.println(b); //　自動変換（int→double,小→大）
			
			// 手動型変換{double(64bit)→int(32bit),大→小}
			double x1= 9.99;
			int y= (int) x1; //明示的変換
			System.out.println(y); // 小数点以下切り捨て
			
			// String（Object）→int(32bit)
			// オブジェクト→基本データ型なので専用のメソッドを使用
			String input="123";	
			int number= Integer.parseInt(input);
			System.out.println(number + 10);
		
			
			// 強制型変換のルール　書き方: (変換後の型) 変数
			// (大きい型から小さい型 への変換)
			double k=10.5;
			int i= (int) k; // double→int(小数点以下切り捨て)
			System.out.println(i);
			
			// 文字列 (String) と数値の変換
			// ”123″ を int に変換し、計算可能に
			String str="123";
			int num =Integer.parseInt(str); // 文字列を int に変換
			System.out.println(num);
			System.out.println(num + 5);
			
			
			// int → String
			// 123 を “123” に変換し、文字列と結合可能に
			int n1 = 123;
			String st=String.valueOf(n1);// intを文字列に変換
			System.out.println(st);
			System.out.println(st+ "円");
			
			// byte や short の計算に注意
			/* byte や short の計算結果は、
			 * 自動的にintに拡張されるため、明示的にキャストが必要になることがある。
			 */
			
			byte a1=10;
			byte b1=20;
			// byte sum=a1+b1; // コンパイルエラー (int 型になってしまう)
			byte sum=(byte)(a1+b1); // 強制型変換を行う。
			System.out.println(sum);
			
			
			//String と数値の変換で例外 (NumberFormatException) に注意
			// String をintやdoubleに変換する際、
			// 変換できない値だとエラー (NumberFormatException) になる。
			
			//String sr="ABC";
			//int num1=Integer.parseInt(sr);// 例外発生！
			//System.out.println(num1);
			
			
			//真偽値（boolean型）
			// true/falseしか設定できない
			boolean isJavaFun = true;
			boolean isRainy = false;
		    System.out.println(isJavaFun);
		    System.out.println(isRainy);
			
		    
		    // 比較演算子を使うと、２つの値を比較し、trueかfalseを返す
			int e=10;
			int f=5;
			System.out.println(e>f);
			System.out.println(e<f);
			System.out.println(e==f);
			System.out.println(e!=f);
			
			// 自動型変換
			int nm =100;
			long bigNum=nm; // int→long(自動型変換)
			System.out.println(bigNum);
			
			int nm1=1010;
			double dou=nm1; // int→double(自動型変換)
			System.out.println(nm1);
			
			// 強制型変換
			// 強制型変換のルール　書き方: (変換後の型) 変数
			
			// doubele→int(小数点以下切り捨て)
			dou=10.546;
			int nn=(int)dou;
			System.out.println(nn); // double → int (小数点以下が切り捨て)

			// 文字列 (String) と数値の変換
			// ”123″ を int に変換し、計算可能に　（String→int に変換）
			String stre= "123";
			int jk =Integer.parseInt(stre); // String→int に変換
			System.out.println(jk+"個");
			// String→int に変換 する場合、Integer.parseIntを使う。

			
			// int→String
			int h=123;
			String bl=String.valueOf(h);
			System.out.println(bl+"ページ");
			// int→Stringに変換する場合、String valueOfを使う
			
			// byte や short の計算に注意
			// byte や short の計算結果は自動的に int に拡張されるため、明示的にキャストが必要になることがある。
			
			// byte→byte
			byte j=80;
			byte s=4;
			byte sum1= (byte) (j+s);
			System.out.println(sum1); // 強制型変換が必要
			
			/*
			 * String と数値の変換で例外 (NumberFormatException) に注意
			 * String を int や double に変換する際、
			 * 変換できない値だとエラー (NumberFormatException) になる
			 */	
			
			
			float ans = 7 / 6;
		    System.out.println(ans);
		    
		    
		    int a11 = 10;
		    int b11 = 10;
		    System.out.println(++a11 + 50);
		    System.out.println(b11++ + 50);
		   
		}
		
	}


      