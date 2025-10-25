package interface_6;

abstract class Employee implements Billable{
	protected String id;
	protected String name;
	
	// コンストラクタ
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	

}
