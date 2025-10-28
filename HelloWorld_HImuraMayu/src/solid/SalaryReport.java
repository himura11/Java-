package solid;

public class SalaryReport {
	public void printSalary(Billable employee) {
		System.out.println(employee.getName() + " の給料は " + employee.calculateSalary() + " 円です。");
	}

}
