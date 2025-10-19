package curriculum_B;
abstract class Employee {

// --- 22.1 ①基本概念 ----
	// フィールド
	// String name;
	
	// メソッド
	void work(){
		System.out.println(name+ "は働いています。");
	}

// --- 22.2 ②クラスとオブジェクト ----
		
	// フィールド
		// String employeeId;
		// String name;
		
	// メソッドの定義
		void showInfo() {
			System.out.println("社員ID: "+ employeeId+", 名前: "+ name);
		}
		
// --- 22.3 ③カプセル化 ----	
	 // フィールド（外から直接アクセスできないように private にする）
		// private String employeeId;
		// private String name;
	
	// employeeId の setter / getter
	// 社員IDを設定するメソッド
		public void setEmployeeId(String id) {
			this.employeeId= id;
	}
    // 社員IDを取得するメソッド
		/*
		public String getEmployeeId() {
			return this.employeeId;
		}
	*/
	// name の setter / getter
	// 名前を設定するメソッド
		public void setName(String name) {
			this.name =name;
		}
	// 名前を取得するメソッド
		/*
		public String getName() {
			return this.name;
		}
		*/
		
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



