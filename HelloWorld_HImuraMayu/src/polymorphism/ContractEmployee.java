package polymorphism;

//--- 契約社員クラス ---
public class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {// コンストラクタ（初期設定用メソッド
		super(id, name); // super は「親クラス（Employee）のコンストラクタを呼ぶ」という意味
	}
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000; // 時給
		return hoursWorked * hourlyRate;// 働いた時間 × 時給で給料
	}
}
