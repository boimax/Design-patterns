/*
 * BRIDGE PATTERN: decouple an abstraction from its implementation so that the two can vary independently.
 * 5 MAIN PARTS: 
 * 
 * 1. interface Implementor: doOperation() actively
 * 
 * 2. concrete implementors: each has its own implementation of doOperation() 
 * 
 * 3. abstract class Abstraction: 
 * - protected Implementor variables: chua lop Implementor
 * - constructor (Implementor)
 * - abstract method doOperation()
 * 
 * 4. concrete abstraction classes:
 * - constructor: super(implementor variable): put varible into parent abstract class Abstraction
 * - doOperation(): has its own implementation
 * 
 * 5. Client: Use concrete abstraction class to force it and specific implementor class to do sth
 */
public class BankBridgePattern {
    public interface AccountImplementor {
        public void openAccount();
    }

    static class CheckingAccount implements AccountImplementor {

        @Override
        public void openAccount() {
            System.out.println("Open Checking Account");
        }

    }

    static class SavingAccount implements AccountImplementor {

        @Override
        public void openAccount() {
            System.out.println("Open Saving Account");
        }

    }

    static abstract class BankAbstraction {
        protected AccountImplementor account; // MOST IMPORTANT 1

        public BankAbstraction(AccountImplementor account) { // MOST IMPORTANT 2
            this.account = account;
        }

        public abstract void openAccount(); // MOST IMPORTANT 3
    }

    static class Vietcombank extends BankAbstraction {

        public Vietcombank(AccountImplementor account) {
            super(account); // MOST IMPORTANT 4
        }

        @Override
        public void openAccount() {
            System.out.print("At Vietcombank: ");
            account.openAccount(); // MOST IMPORTANT 5: force concrete implementors to doOperation()
        }

    }

    static class TPbank extends BankAbstraction {

        public TPbank(AccountImplementor account) {
            super(account);
        }

        @Override
        public void openAccount() {
            System.out.print("At TPbank: ");
            account.openAccount();
        }

    }

    public static void main(String[] args) {
        BankAbstraction vietcombank = new Vietcombank(new CheckingAccount());
        vietcombank.openAccount();

        BankAbstraction tpbank = new TPbank(new SavingAccount());
        tpbank.openAccount();
    }
}
