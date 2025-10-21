
package continuation;

public class Main {

	public static void main(String[] args) {
	
     // --- 22.4 ④継承 ----	
		
	// 正社員オブジェクトを作成
		FullTimeEmployee full = new FullTimeEmployee("F01","山田太郎");

	// パート社員オブジェクトを作成
		PartTimeEmployee part = new PartTimeEmployee("P0", "佐藤花子");
	
	// 9時間勤務時の給与を計算
		int fullWage= full.calculateDailyWage(9);
		int partWage = part.calculateDailyWage(9);
		
	 // 結果を出力
		System.out.println("正社員の給与: "+ fullWage + "円");
		System.out.println("パート社員の給与: "+ partWage + "円");
	}	
}

