package class_object;

public class Main {

	public static void main(String[] args) {
// --- 22.2 ②クラスとオブジェクト  ----
		
	// Employeeクラスのインスタンス生成
		Employee emp = new Employee();
	// フィールドに値を設定
		emp.employeeId = ("E001");
		emp.name = ("佐藤太郎");
	// メソッド呼び出し
		emp.showInfo();
	}
}
