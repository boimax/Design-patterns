public class BankFactoryGPCoder {
    public interface Bank {
        String getBankName();
    }

    static class Vietcombank implements Bank {

        @Override
        public String getBankName() {
            return "Vietcombank";
        }

    }

    static class TPBank implements Bank {

        @Override
        public String getBankName() {
            return "TPBank";
        }

    }

    public enum BankType {
        VIETCOMBANK,
        TPBANK;
    }

    public class BankFactory {

        private BankFactory() {
        }

        public static final Bank getBank(BankType bankType) {
            switch (bankType) {

                case TPBANK:
                    return new TPBank();

                case VIETCOMBANK:
                    return new Vietcombank();

                default:
                    throw new IllegalArgumentException("This bank type is unsupported");
            }
        }

    }

    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName()); // TPBank
    }
}
