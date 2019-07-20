package section11.Q1103;

public class Matango {
    int hp = 50;
    private char suffix;

    public Matango(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero h) {
        StringBuilder attackText = new StringBuilder();
        attackText.append("キノコ" + this.suffix + "の攻撃\n");
        attackText.append("10のダメージ\n");
        System.out.println(attackText.toString());
        h.setHp(h.getHp - 10);
    }

}
