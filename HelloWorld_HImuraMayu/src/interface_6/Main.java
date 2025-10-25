package interface_6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Billable>employees= new ArrayList<>();
		employees.add(new FullTimeEmployee("F01","山田太郎"));
		employees.add(new ContractEmployee("C02","佐藤花子"));
		
		for(Billable emp: employees){
			System.out.println("給与は "+ emp.costForDay(9)+ " 円です。"); // 9時間勤務の例
		}
	}
}
