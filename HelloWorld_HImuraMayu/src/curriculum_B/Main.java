
package curriculum_B;

public class Main {

	public static void main(String[] args) {
	/*
	 // --- 22.1 ①基本概念 ----
	    // Employeeクラスのインスタンスを生成
		Employee emp = new Employee();
		
	    // nameに「山田太郎」を設定
		emp.name=("山田太郎");
		// work()メソッドを呼び出して出力
		emp.work();
		
	// --- 22.2 ②クラスとオブジェクト  ----
        // Employeeクラスのインスタンス生成
		// Employee emp = new Employee();　// ←既存
		
		// フィールドに値を設定
		emp.employeeId=("E001");
		emp.name =("佐藤太郎");
		// メソッド呼び出し
		emp.showInfo();
		
	// --- 22.3 ③カプセル化 ----	
		// Employee オブジェクトを作る
		// Employee emp = new Employee();　// ←既存

		// setメソッドでデータを設定
		emp.setEmployeeId("E002");
		emp.setName("田中花子");
		
		// getメソッドでデータを取得して出力
		System.out.println("社員ID: "+ emp.getEmployeeId() + ", 名前: "+ emp.getName());

     // --- 22.4 ④継承 ----	
	*/
		
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

