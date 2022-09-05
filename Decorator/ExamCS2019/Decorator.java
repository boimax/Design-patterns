/* 
 * DECORATOR PATTERN: 
 * - Implement 1 more concrete decorator class PrintZ
 * - Modify class demo to print AZ, AXYZ, AXXZ, AZXYY
 */
public class Decorator {
    public interface Printer {
        void printlt();
    }

    static class PrintA implements Printer {
        @Override
        public void printlt() {
            System.out.print("A");
        }
    }

    static abstract class PrintCore implements Printer {
        private Printer core;

        public PrintCore(Printer inner) {
            core = inner;
        }

        @Override
        public void printlt() {
            core.printlt();
        }
    }

    static class PrintX extends PrintCore {
        public PrintX(Printer inner) {
            super(inner);
        }

        @Override
        public void printlt() {
            super.printlt();
            printX();
        }

        private void printX() {
            System.out.print("X");
        }

    }

    static class PrintY extends PrintCore {
        public PrintY(Printer inner) {
            super(inner);
        }

        @Override
        public void printlt() {
            super.printlt();
            printY();
        }

        private void printY() {
            System.out.print("Y");
        }

    }

    static class PrintZ extends PrintCore {

        public PrintZ(Printer inner) {
            super(inner);
        }

        @Override
        public void printlt() {
            super.printlt();
            printZ();
        }

        public void printZ() {
            System.out.print("Z");
        }
    }

    public static void main(String[] args) {

        // Printer[] array = { new PrintX(new PrintA()), new PrintY(new PrintX(new
        // PrintA())),
        // new PrintY(new PrintX(new PrintY(new PrintA()))) };
        Printer[] array = { new PrintZ(new PrintA()), new PrintZ(new PrintY(new PrintX(new PrintA()))),
                new PrintZ(new PrintX(new PrintX(new PrintA()))),
                new PrintY(new PrintY(new PrintX(new PrintZ(new PrintA())))) };
        for (Printer anArray : array) {
            anArray.printlt();
            System.out.print(" ");
        }

    }

}
