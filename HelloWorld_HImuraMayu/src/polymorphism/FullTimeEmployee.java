package polymorphism;

//--- 正社員クラス ---
public class FullTimeEmployee extends Employee{
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate =  1250; // 時給
		int overtime = Math.max(0, hoursWorked - 8); // 残業時間
		int regularHours = hoursWorked - overtime; // 通常勤務の時間（＝残業を引いた分）
		return(regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
		
	}
	
}

	
	
