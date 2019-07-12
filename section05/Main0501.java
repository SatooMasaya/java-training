package section05;

/*
 * メソッドを使うクラス
 */

public class Main0501 {

    public static void main(String[] args) {
        introduceOneself();
        introduceOneselfKai();
    }

    public static void introduceOneself() {
        String name = "masaya";
        int age = 24;
        double height = 168.0;
        String sex = "男";

        System.out.println("私は" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("性別は" + sex + "です。");
    }

    public static void introduceOneselfKai() {
        String name = "masaya";
        int age = 24;
        double height = 168.0;
        String sex = "男";

        StringBuilder introduceOneselfText = new StringBuilder();
        introduceOneselfText.append("私は" + name + "です。\n");
        introduceOneselfText.append("年齢は" + age + "歳です。\n");
        introduceOneselfText.append("身長は" + height + "cmです。\n");
        introduceOneselfText.append("性別は" + sex + "です。\n");
        System.out.println(introduceOneselfText.toString());
    }

}
