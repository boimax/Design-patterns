public class Vietcombank extends Bank {
    Account account;

    public Vietcombank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Your Vietcombank account is a ");
        account.openAccount();
    }

}
