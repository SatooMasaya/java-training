package section05;

/*
 * 引数があるメソッドを使うクラス
 */

public class Main0502 {

    public static void main(String[] args) {
        email("Hello!Java!", "masaya@gmail.com", "Hello!!Hello!!Hello!!Hello!!Hello!!");
    }

    public static void email(String title, String address, String text) {
        System.out.println("「" + address + "」に、以下のメールを送信しました");
        System.out.println("件名:「" + title + "」");
        System.out.println("本文:「" + text + "」");
    }

}
