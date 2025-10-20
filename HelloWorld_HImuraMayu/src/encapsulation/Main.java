package encapsulation;

public class Main {
	   public static void main(String[] args) {
	
// --- 22.3 ③カプセル化 ----	
	// Employee オブジェクトを作る
	Employee emp= new Employee();
	
	// setメソッドでデータを設定
	emp.setEmployeeId("E002");
	emp.setName("田中花子");
	
	// getメソッドでデータを取得して出力
	System.out.println("社員ID: "+emp.getEmployeeId() + ", 名前: "+emp.getName());
	}
}
