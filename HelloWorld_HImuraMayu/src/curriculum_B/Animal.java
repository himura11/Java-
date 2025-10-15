package curriculum_B;

public class Animal {

	// 情報を入れる箱（フィールド）を作る
	private String name; // 動物名（文字列）
	private double length; // 体長（小数）
	private int speed; // 速度（整数）
	
	
	// setter （値を入れる）/ データを入れるための入口     
	public void setName(String name) {
		this.name= name;
	}
	public void setLength(double length) {
		this.length= length;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// getter （値を取り出す）/データを取り出すための出口 
	public String getName(){
		return this.name;
	}
	public double getLength(){
		return this.length;
	}
	public int getSpeed(){
		return this.speed;
	}
	
	
}
