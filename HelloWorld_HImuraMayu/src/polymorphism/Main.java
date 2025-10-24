package polymorphism;

import java.util.ArrayList;
import java.util.List;
//--- メインクラス ---
public class Main {

	public static void main(String[] args) {
		// ① 社員リストを作成
		List<Employee> employees= new ArrayList<>();
		
		// FullTimeEmployee と ContractEmployee を追加
		employees.add(new FullTimeEmployee("F01", "山田太郎"));
		employees.add(new FullTimeEmployee("F02", "佐藤花子"));
		employees.add(new ContractEmployee("C01", "鈴木一郎"));
	    employees.add(new ContractEmployee("C02", "高橋舞"));
	    

        // ② for-eachループで全員の給与を計算・出力
	    for(Employee emp : employees) {
	    	 // ③ 共通の Employee 型で呼び出し
	    	int wage =  emp.calculateDailyWage(9); // 9時間勤務とする
	    	System.out.println(emp.name + " の給与 : " + wage + "円");
	    }
	}

}
