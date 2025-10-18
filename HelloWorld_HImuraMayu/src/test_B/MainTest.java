package test_B;

public class MainTest {

	public static void main(String[] args) {
	    //オブジェクトを作る
		Person p= new Person("Arice", 25);
	
		// 値を取り出す（getter）
	    System.out.println(p.getName() + "ちゃん");
	    System.out.println("私は" + p.getAge()+ "歳です。");

	}

}
