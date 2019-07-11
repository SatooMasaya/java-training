package section05;

/*
 * メソッドを使うクラス
 */

public class Main0501 {

    public static void main(String[] args) {
        introduceOneself();
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

}
