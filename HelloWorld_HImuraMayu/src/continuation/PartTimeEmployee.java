package continuation;

public class PartTimeEmployee extends Employee {
	// 定数: 時給
	private static final int HOURLY_RATE = 1000;
	
	// コンストラクタ（親クラスのコンストラクタを呼び出す）
	public PartTimeEmployee(String id, String name) {
		super(id, name); // Employeeのコンストラクタを呼ぶ
	}


	// calculateDailyWageの実装（割増なし）
	@Override
	public int calculateDailyWage(int hoursWorked) {
		// 割増なし → 時間 × 時給
		return hoursWorked * HOURLY_RATE;
	}
	
}
