package section08.Q0804;

import java.util.Random;

/*
 * Cleric(聖職者)クラスの作成（メソッドの追加２）
 */

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int MAXHP = 50;
    final int MAXMP = 10;

    public void selfAid() {
        if (this.mp >= 5) {
            this.mp -= 5;
            this.hp = MAXHP;
        }
    }

    /**
     * 祈りメソッド MPを回復する。
     * 
     * @param praySecond 祈った秒数
     * @return recoveryAmount 実際の回復量
     */
    public int pray(int praySecond) {
        int recoveryAmount; // 回復量を代入する変数
        recoveryAmount = praySecond + new Random().nextInt(3);

        if (this.mp + recoveryAmount <= MAXMP) { // 回復量が最大MPを超えない場合、そのまま回復量を返す
            this.mp += recoveryAmount;
            return recoveryAmount;
        } else { // 回復量が最大MPを超えた場合、実際の回復量を求めて、返す
            this.mp = MAXMP;
            recoveryAmount = MAXMP - this.mp;
            return recoveryAmount;
        }
    }

}
