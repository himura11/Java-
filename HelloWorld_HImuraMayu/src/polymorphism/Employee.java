package polymorphism;

//--- 抽象クラス（共通の型）---
abstract class Employee{
	protected String id;
	protected String name;
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public abstract int calculateDailyWage(int hoursWorked);
}
