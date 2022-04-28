public class TPBank extends Bank {
    Account account;

    public TPBank(Account account) {
        this.account = account;
    }

    @Override
    public void openAccount() {
        System.out.println("Your TPBank Account is a ");
        account.openAccount();
    }

}
