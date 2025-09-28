package curriculum_B;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num=2;
		switch(num) {
		 case 1:
			 System.out.println("1です");
		 case 2:
			 System.out.println("2です");
	     case 3:
	    	 System.out.println("3です");
	    defalut:
	    	System.out.println("その他の数値です");	 
		}
		int month= 13; //存在しない月
		switch(month) {
		 case 1: case 2: case 12:
			 System.out.println("冬です");
			 break;
         case 3: case 4: case 5:
        	 System.out.println("春です");
        	 break;
         case 6: case 7: case 8:
        	 System.out.println("夏です");
        	 break;
         case 9: case 10: case 11:
        	 System.out.println("秋です");
        	 break;
         default :
        	 System.out.println("無効な月です");
		}
		
	}

	
	
}
