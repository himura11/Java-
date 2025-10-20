package basic_concept;

public class Main {

	public static void main(String[] args) {
		// --- 22.1 ①基本概念 ----
	    
		// Employeeクラスのインスタンスを生成
		Employee emp = new Employee();
		
		// nameに「山田太郎」を設定
		emp.name=("山田太郎");
		
		// work()メソッドを呼び出して出力
		emp.work();
	}
}
