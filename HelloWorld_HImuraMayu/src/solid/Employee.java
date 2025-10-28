package solid;

abstract class Employee implements Billable {
	protected String name;
	protected int hours;
	
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	public String getName() {
		return name;
	}
	public int getHours() {
		return hours;
	}
}
