public class TPBank extends Bank {
    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Your TPBank Account is a ");
        account.openAccount();
    }

}
