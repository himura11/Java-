package polymorphism;

//--- 抽象クラス（共通の型）---
abstract class Employee{ // abstract → 抽象クラス
	protected String id;
	protected String name; 
	
	public Employee(String id, String name) {// コンストラクタ
		this.id = id;
		this.name = name;
	}
	public abstract int calculateDailyWage(int hoursWorked); // calculateDailyWage → メソッド名
}
