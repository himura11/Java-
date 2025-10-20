package curriculum_B;

public class FullTimeEmployee extends Employee{
	
	// 定数: 時給
	private static final int HOURLY_RATE = 1200;
	
	// コンストラクタ（親クラスのコンストラクタを呼び出す）
	public FullTimeEmployee(String id, String name) {
		super(id, name); // ← 親クラス(Employee)に渡して初期化
	}
	
	// calculateDailyWageの実装
	@Override
	public int calculateDailyWage(int hoursWorked) {
		if(hoursWorked<=8) {
			// 8時間以内は普通の時給
			return hoursWorked * HOURLY_RATE;
		} else {
			// 残業時間を計算
			int overtime= hoursWorked - 8;
			// 残業分は1.25倍
			return (8*HOURLY_RATE)+ (int)(overtime*HOURLY_RATE * 1.25);
		}
	}
}
