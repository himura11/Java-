package curriculum_D;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character{
	
	public Player() { // コンストラクタ 
		Scanner sc = new Scanner(System.in); // キーボード入力を受け取るための準備
		System.out.println("プレイヤー名を入力してください: "); 
		this.name = sc.nextLine(); 
		
		Random rand = new Random();
		this.hp = rand.nextInt(50) + 70; // 70〜119
		this.at = rand.nextInt(10) + 10; // 10〜19
		this.sp = rand.nextInt(5) + 5 ;  // 5〜9
		
		
	}
}
