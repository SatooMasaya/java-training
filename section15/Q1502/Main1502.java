package section15.Q1502;

public class Main1502 {

    public static void main(String[] args) {
        String s = null;

        try {
            System.out.print(s.length());
        } catch (Exception e) {
            System.out.println("NullPointerException 例外を catch しました");
            System.out.println("ーースタックトレース（ここから）ーー");
            e.printStackTrace();
            System.out.println("ーースタックトレース（ここまで）ーー");
        }

    }

}
