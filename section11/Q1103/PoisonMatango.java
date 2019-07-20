package section11.Q1103;

public class PoisonMatango extends Matango {

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void PoisonAttack(Hero hero) {
        final int attackCount = 5;
        super.attack(hero);
        for (int count = attackCount; 0 < count; count--) {
            StringBuilder attackText = new StringBuilder();
            attackText.append("さらに毒の胞子をばらまいた！\n");
            attackText.append(hero.MAXHP / 5 + "のダメージ\n");
            System.out.println(attackText.toString());
            hero.setHp(hero.getHp - hero.MAXHP / 5);

        }
    }

}
