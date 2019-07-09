package section03;

/*
 * if文のブロックの範囲を理解するためのクラス
 */

public class Main0304 {

    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki) {
            System.out.println("選択をします");
            System.out.println("散歩にいきます");
        } else {
            System.out.println("DVDを見ます");
            System.out.println("寝ます");
        }
    }

}
