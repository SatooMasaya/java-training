package section08.Q0804;

import java.util.Random;

/*
 * Cleric(聖職者)クラスの作成（メソッドの追加２）
 */

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int MAX_HP = 50;
    final int MAX_MP = 10;

    /**
     * セルフエイドメソッド HPを回復する
     */
    public void selfAid() {
        if (this.mp >= 5) {
            this.mp -= 5;
            this.hp = MAX_HP;
        }
    }

    /**
     * 祈りメソッド MPを回復する。
     *
     * @param praySecond 祈った秒数
     * @return recoveryAmount 実際の回復量
     */
    public int pray(int praySecond) {
        // 祈った秒数にランダムで０〜２ポイントを補正した回復量
        int recoveryAmount = praySecond + new Random().nextInt(3);

        if (this.mp + recoveryAmount <= MAX_MP) { // 回復量が最大MPを超えない場合、そのまま回復量を返す
            this.mp += recoveryAmount;
        } else { // 回復量が最大MPを超えた場合、実際の回復量を求めて、返す
            this.mp = MAX_MP;
            recoveryAmount = MAX_MP - this.mp;
        }

        return recoveryAmount;

    }

}
