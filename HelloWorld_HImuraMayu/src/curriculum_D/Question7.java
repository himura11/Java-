package curriculum_D;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Question7 {
    public static void main(String[] args) {
        Player player = new Player();
        Daemon daemon = new Daemon();
        daemon.loadDaemon("daemon_status.txt");

        System.out.println("\n=== バトル開始！ ===");
        System.out.println(player.name + " vs " + daemon.name + "\n");

        StringBuilder log = new StringBuilder();
        Random rand = new Random();

        Character first, second;
        if (player.sp > daemon.sp) {
            first = player;
            second = daemon;
        } else if (player.sp < daemon.sp) {
            first = daemon;
            second = player;
        } else {
            first = rand.nextBoolean() ? player : daemon;
            second = (first == player) ? daemon : player;
        }

        log.append("先攻: ").append(first.name).append("\n");

        while (player.hp > 0 && daemon.hp > 0) {
            second.hp -= first.at;
            log.append(first.name).append(" の攻撃! ").append(second.name)
               .append(" のHP: ").append(second.hp).append("\n");
            if (second.hp <= 0) break;

            first.hp -= second.at;
            log.append(second.name).append(" の攻撃! ").append(first.name)
               .append(" のHP: ").append(first.hp).append("\n");
        }

        String winner = (player.hp > 0) ? player.name : daemon.name;
        log.append("\n勝者: ").append(winner);

        System.out.println(log);

        try (FileWriter fw = new FileWriter("battle_log.txt")) {
            fw.write(log.toString());
        } catch (IOException e) {
            System.out.println("バトルログの書き込みに失敗しました。");
        }

        System.out.println("\nバトル結果を battle_log.txt に保存しました。");
    }
}