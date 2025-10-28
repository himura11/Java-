package solid;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Billable>employees= new ArrayList<>();
		employees.add(new FullTimeEmployee("山田太郎", 8));
		employees.add(new ContractEmployee("佐藤花子", 7));
		
		for(Billable emp : employees) {
			System.out.println(emp.getName() + " の給料は " + emp.calculateSalary() + " 円です。");
		}


	}

}
