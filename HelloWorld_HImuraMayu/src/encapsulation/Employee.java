package encapsulation;

public class Employee {

// --- 22.3 ③カプセル化 ----	
	// フィールド（外から直接アクセスできないように private にする）
	private String employeeId;
	private String name;
	
	// employeeId の setter / getter
	// 社員IDを設定するメソッド
	public void setEmployeeId(String id) {
		this.employeeId = id;
	}
	// 社員IDを取得するメソッド
	public String getEmployeeId(){
		return this.employeeId;
	}
	
	// name の setter / getter
	// 名前を設定するメソッド
	public void setName(String name) {
		this.name = name;
	}
	// 名前を取得するメソッド
	public String getName(){
		return this.name;
	}
}
