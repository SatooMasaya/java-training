package section03;

import java.util.Random;
import java.util.Scanner;

/*
 * for文を使うクラス
 */

public class Main0306 {

    public static void main(String[] args) {

        int ans = new Random().nextInt(10);

        System.out.println("【数当てゲーム】");

        for (int i = 0; i < 5; i++) {
            System.out.println("０から９までの数字を入力してください");
            int num = new Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }

        System.out.println("ゲームを終了します");

    }

}
