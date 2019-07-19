package section10.Q1003;

/**
 * 魔法使いクラス
 * 
 * @author satoumasaya
 *
 */

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;// 基本回復ポイント
        int recovPoint = (int) (basePoint * this.wand.power);// 杖による増幅
        h.setHp(h.getHp() + recovPoint);// 勇者のHPを回復させる
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }

        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MPが負の値である。処理を中断。");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("魔法使いの名前がnullである。処理を中断。");
        }

        if (name.length() <= 2) {
            throw new IllegalArgumentException("魔法使いの名前が短すぎる。３文字以上にしてください。処理を中断。");
        }

        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {

        if (wand == null) {
            throw new IllegalArgumentException("杖がnullである。処理を中断。");
        }

        if (wand.name == null) {
            throw new IllegalArgumentException("杖の名前がnullである。処理を中断。");
        }

        if (wand.name.length() <= 2) {
            throw new IllegalArgumentException("杖の名前が短すぎる。３文字以上にしてください。処理を中断。");
        }

        if (wand.power > 100 && wand.power > 0.5) {
            throw new IllegalArgumentException("魔力の増幅率が許容範囲から外れています。0.5 ~ 100の間の数値を入力してください。処理を中断。");
        }

        this.wand = wand;
    }

}
