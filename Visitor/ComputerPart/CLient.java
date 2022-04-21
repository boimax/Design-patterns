/*
This example is taken from tutoriorpoints, and is also the example showed by Prof Manuel in class
*/
package Visitor.ComputerPart;

public class CLient {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
