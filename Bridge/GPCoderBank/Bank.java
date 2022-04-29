public abstract class Bank {
    protected Account account; // protected: to be used again in child classes: Vietcombank & TPBank

    public Bank(Account account) { // HAS -A
        this.account = account;
    }

    public abstract void openAccount();
}
