package interface_6;

public class FullTimeEmployee extends Employee{
	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name); // super は親クラス（この場合 Employee）のコンストラクタを呼ぶ
	}

	@Override    // Billableのルールを実装（中身を書く）
	public int costForDay(int hoursWorked) { // costForDay→ メソッド名「1日のコスト（給与など）を計算するメソッド」
		int hourlyRate = 1250; // 時給
		int overtime = Math.max(0, hoursWorked - 8); // Math.max(a, b) は a と b のうち大きい方を返す
		int regularHours = hoursWorked - overtime;
		return (int)(regularHours * hourlyRate + overtime * hourlyRate * 1.25); //１日の給与合計金額
	}
}
