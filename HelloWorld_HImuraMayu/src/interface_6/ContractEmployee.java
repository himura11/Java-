package interface_6;

public class ContractEmployee extends Employee{
	public ContractEmployee(String id, String name){
		super(id, name);
	}

	@Override    // Billableのルールを実装（中身を書く）
	public int costForDay(int hoursWorked) {
		return hoursWorked * 1000;
	}
}
