package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character{
	
	public void loadDaemon(String filename) {
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			this.name = br.readLine();
			this.hp = Integer.parseInt(br.readLine());
			this.at = Integer.parseInt(br.readLine());
			this.sp = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("ファイル読み込みに失敗しました。");
		}
	}
}
