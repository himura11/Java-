package curriculum_C;

public class Question6 {

	public static void main(String[] args) {
		Player player = new Player();
		CPU cpu = new CPU();
		String hands[] = {"グー", "チョキ", "パー"};
		
		while(true) {
			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();
			
			System.out.println("あなたの手: " + hands[playerHand]);
			System.out.println("CPUの手: " + hands[cpuHand]);
			
	         // 勝敗判定
			if(playerHand == cpuHand) {
				System.out.println("あいこです。もう一度！");
			}else if(
				(playerHand == 0 && cpuHand == 1)|| // グー vs チョキ
				(playerHand == 1 && cpuHand == 2)|| // チョキ vs パー
				(playerHand == 2 && cpuHand == 0)   // パー vs グー
			) {
				System.out.println("あなたの勝ち！");
				break;
			}else {
				System.out.println("あなたの負け…もう一度！");
			}	
		}	
	}
}
