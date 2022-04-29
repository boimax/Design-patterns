public class Vietcombank extends Bank {
    public Vietcombank(Account account) {
        super(account);
    }

    /*
     * NOTE:
     * This class USES (HAS-A) concrete classes of Account interface, so this
     * openAccount() method will call the openAccount() method
     * of each conrete classes above to operate.
     */

    @Override
    public void openAccount() {
        System.out.println("Your Vietcombank account is a ");
        account.openAccount(); // call the method of concrete classes of Account interface.
    }

}
