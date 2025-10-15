package test_B;

public class MixTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//switch文で出力 bll : 🦉　🍵　🌹
	    //	 🍵と一致するcaseを探して、一致したら実行する
				String bll="🍵"; 
				  switch (bll) {
				    case "🦉":
				    	System.out.println("rn");
				    	break;
				    case"🍵":
				    	System.out.println("se");
				    	break;
				    case"🌹":
				    	System.out.println("ki");
				    	break;
				    default:
				    	System.out.println("対象外");
			
				  
		// tgak の3つの絵文字☂️,💉,🔍️を順番に switch 文で出力する例 
				  // tgakの絵文字配列
				  String[] tgak = {"☂️", "💉", "🔍"};
				  
				  // 配列を順番にチェック
				 for(int i=0; i<tgak.length; i++) {
					 switch(tgak[i]) {
					   case"☂️":
						   System.out.println("傘です");
						   break;
					   case"💉":
						   System.out.println("注射です");
						   break;
					   case"🔍":
						   System.out.println("虫眼鏡です");
						   break;
					   default:
						   System.out.println("対象外");
						   break;
					 }
				 }
	 //① 拡張for文（for-each文）
	    // 配列やリストの要素を順番に取り出すための文。 			 
	    //配列 bll に 🦉🍵🌹 の3つの絵文字を入れて、拡張for文で順番に出力
			// 絵文字の配列を用意
				 String bll1 []= {"🦉","🍵","🌹"};
				 
			 // 拡張for文で順番に取り出して出力
				 for(String emoji : bll1) {
					 System.out.println("今の絵文字は"+emoji);
				 }
	        }
       }
}


