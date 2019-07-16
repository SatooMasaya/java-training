package section08.Q0803;

/*
 * Cleric(聖職者)クラスの作成（メソッドの追加１）
 */

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int MAXHP = 50;
    final int MAXMP = 10;

    /**
     * セルフエイドメソッド HPを回復する
     */
    public void selfAid() {
        if (this.mp >= 5) {
            this.mp -= 5;
            this.hp = MAXHP;
        }
    }
}
