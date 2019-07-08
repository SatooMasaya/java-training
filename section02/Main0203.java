package section02;

import java.util.Random;
import java.util.Scanner;

public class Main0203 {

    public static void main(String[] args) {
        String helloText = "ようこそ占いの館へ";
        String nameText = "あなたの名前を入力してください";
        String ageText = "あなたの年齢を入力してください";

        System.out.println(helloText);
        System.out.println(nameText);
        String name = new Scanner(System.in).nextLine();
        System.out.println(ageText);
        String ageString = new Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);

        String UranaiText = "占い結果が出ました！";
        String UnkiText = "1:大吉 2:中吉 3:吉 4:凶";

        int fortune = new Random().nextInt(3);
        fortune++;
        System.out.println(UranaiText);
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println(UnkiText);
    }

}
