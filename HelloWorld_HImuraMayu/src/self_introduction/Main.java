package self_introduction;

public class Main {

	public static void main(String[] args) {
		// 問題5：weight に 60 を入れる
		Person p1 = new Person("鈴木太郎", 20, 1.70, 60);
		
		// 出力
		p1.print();
		Person.printCount();
	}
	

}
