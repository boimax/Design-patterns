
/* VISITOR PATTERN:
 * => Used when we have to perform an OPERATION on a group of similar kind of Objects.
 * => 5 PARTS (interface Visitor + concrete Visitor classes + interface Elements + concrete Element classes + Client)
 * => TOO SIMPLE TO ADD NEW CONCRETE VISITOR BUT COMPLEX TO ADD NEW CONCRETE ELEMENT 
 * 
 * - interface Visitor: has visit() method of all concrete elements
 * + concrete Visitor classes: has its own visit() method implementation of each concrete element
 * 
 * - interface Element: has just 1 accept(interface Visitor) method => force ComputerPartVisitor to accept to let visit() method works becasue ComputerPartVisitor has visit() methods 
 * + concrete Element classes: each has its own accept() method implementation
 * 
 * - client: uses interface Elements + concrete Visitor classes
 * + interface Element = new concrete Element
 * + interface Visitor = new concrete Visitor
 * + concrete element.accept(concrete visitor)
 *  
 * - REFERENCE: 
 * + https://viblo.asia/p/tim-hieu-visitor-pattern-qua-vi-du-ZabG9zedvzY6
 * + https://viblo.asia/p/single-dispatch-and-double-dispatch-with-visitor-design-pattern-in-java-part-2-gAm5ypyLldb
 */
import java.util.*;

public class VisitorComputerPart {
    public interface ComputerPartVisitor {
        public void visit(Computer computer);

        public void visit(Mouse mouse);

        public void visit(Keyboard keyboard);

        public void visit(Monitor monitor);
    }

    static class ComputerPartDisplayVisitor implements ComputerPartVisitor {

        @Override
        public void visit(Computer computer) { // OPERATION

            System.out.println("Displaying Computer.");
        }

        @Override
        public void visit(Mouse mouse) { // OPERATION

            System.out.println("Displaying Mouse.");
        }

        @Override
        public void visit(Keyboard keyboard) { // OPERATION

            System.out.println("Displaying Keyboard.");
        }

        @Override
        public void visit(Monitor monitor) { // OPERATION

            System.out.println("Displaying Monitor.");
        }

    }

    public interface ComputerPart {
        public void accept(ComputerPartVisitor computerPartVisitor); // accept() contains visit() => use
                                                                     // ComputerPartVisitor
    }

    /*
     * Each element will accept visit() method so that the action is active
     */
    static class Keyboard implements ComputerPart {

        @Override
        public void accept(ComputerPartVisitor computerPartVisitor) {

            computerPartVisitor.visit(this);
        }

    }

    static class Mouse implements ComputerPart {

        @Override
        public void accept(ComputerPartVisitor computerPartVisitor) {

            computerPartVisitor.visit(this);
        }

    }

    static class Monitor implements ComputerPart {

        @Override
        public void accept(ComputerPartVisitor computerPartVisitor) {

            computerPartVisitor.visit(this);
        }

    }

    static class Computer implements ComputerPart {
        // Computer is also a part of ComputerPart but it combines Mouse + Monitor +
        // Keyboard
        ComputerPart[] parts;

        public Computer() {
            parts = new ComputerPart[] { new Monitor(), new Mouse(), new Keyboard() };
        }

        @Override
        public void accept(ComputerPartVisitor computerPartVisitor) {

            for (ComputerPart part : parts) { // force 3 elements: Monitor, Mouse, Keyboard to accept visit() method
                part.accept(computerPartVisitor);
            }
            computerPartVisitor.visit(this); // computer accept visit() => 4 elements accept visit()
        }

    }

    public static void main(String[] args) {
        ComputerPart computer = new Computer(); /*
                                                 * ComputerPart: interface
                                                 * MOST IMPORTANT: computer = monitor + mouse + keyboard => new Computer
                                                 * () = new Mouse() + new Keyboard() + new Monitor()
                                                 */
        computer.accept(new ComputerPartDisplayVisitor()); // call accept() of concrete visitors
    }
}
