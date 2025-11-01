package curriculum_C;

import java.util.Random;

public class CPU {
	Random rand = new Random();
	
	public int getHand() {
		return rand.nextInt(3); // 0,1,2 のいずれか
	}
	
	

}
