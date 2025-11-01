package curriculum_C;

import java.util.Scanner;

public class Player {
	Scanner scanner = new Scanner(System.in);
	
	public int getHand() {
		System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
		return scanner.nextInt();
	}
}
