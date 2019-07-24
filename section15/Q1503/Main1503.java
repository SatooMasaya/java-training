package section15.Q1503;

public class Main1503 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("三");
        } catch (Exception e) {
            System.out.println("NumberFormatException 例外を catch しました");
            System.out.println("ーースタックトレース（ここから）ーー");
            e.printStackTrace();
            System.out.println("");
            System.out.println("ーースタックトレース（ここまで）ーー");
        }

    }

}
