package section14.Q1402;

public class Main1402 {

    public static void main(String[] args) {
        Account account = new Account("4649", 1592);
        System.out.println(account);// ¥1592(口座番号=4649)と表示する

        Account account2 = new Account(" 4649", 1592);
        Account account3 = new Account(" 4650", 1592);

        System.out.println(account.equals(account2));
        System.out.println(account2.equals(account));

        System.out.println(account3.equals(account));
    }

}
