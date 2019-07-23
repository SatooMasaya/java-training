package section14.Q1402;

public class Account {
    private String accountNumber;// 口座番号
    private int balance;// 残高

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        StringBuilder accountText = new StringBuilder();
        accountText.append("¥" + balance + "(口座番号=" + accountNumber + ")\n");
        return accountText.toString();
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Account) {
            Account anotherAccount = (Account) anObject;
            if (this.accountNumber.trim().equals(anotherAccount.accountNumber.trim())) {
                return true;
            }
        }
        return false;
    }

}
