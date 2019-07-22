package section09.Q0901;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }

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
        int recoveryAmount; // 回復量を代入する変数
        recoveryAmount = praySecond + new Random().nextInt(3);

        if (this.mp + recoveryAmount <= MAX_MP) { // 回復量が最大MPを超えない場合、そのまま回復量を返す
            this.mp += recoveryAmount;

        } else { // 回復量が最大MPを超えた場合、実際の回復量を求めて、返す
            this.mp = MAX_MP;
            recoveryAmount = MAX_MP - this.mp;
        }

        return recoveryAmount;

    }
}