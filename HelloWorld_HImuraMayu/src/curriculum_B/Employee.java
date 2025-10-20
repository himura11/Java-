package curriculum_B;
abstract class Employee {





		
// --- 22.4 ④継承 ----	
		// 抽象クラス Employee
		private String employeeId;
		private String name;
		
		 // コンストラクタ
		public Employee(String id,String name) {
			this.employeeId = id;
			this.name = name;
		}
			
		 // Getterメソッド
		  public String getEmployeeId() {
			  return employeeId;
		  }
		  public String getName() {
			  return name;
		  }
		  
		  // 抽象メソッド（サブクラスで中身を実装する）
		  public abstract int calculateDailyWage(int hoursWorked);

}



