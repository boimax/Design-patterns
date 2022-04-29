public class Client {
    public static void main(String[] args) {
        Bank vietcombank = new Vietcombank(new CheckingAccount());
        vietcombank.openAccount();

        Bank tpbank = new TPBank(new SavingAccount());
        tpbank.openAccount();
    }
}
