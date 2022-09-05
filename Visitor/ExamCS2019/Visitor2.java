
/*
 * Add new Element: Class COMP contains 3 classes FOO, BAR, BAZ
 * 5 PAIN PARTS:
 * - Visitor interface 
 * - PlainVisitor: concrete Visitor
 * - Element interface
 * - FOO, BAR, BAZ, COMP: concrete elements
 * - Client
 */
import java.util.*;

public class Visitor2 {
    public interface Visitor {
        void visit(FOO foo);

        void visit(BAR bar);

        void visit(BAZ baz);

        void visit(COMP comp);
    }

    static class PlainVisitor implements Visitor {

        @Override
        public void visit(FOO foo) {

            System.out.println("plain: " + foo.getType());
        }

        @Override
        public void visit(BAR bar) {

            System.out.println("plain: " + bar.getType());
        }

        @Override
        public void visit(BAZ baz) {

            System.out.println("plain: " + baz.getType());
        }

        @Override
        public void visit(COMP comp) {

            System.out.println("plain: " + comp.getType());
        }
    }

    public interface Element {
        public void accept(Visitor v);
    }

    static class FOO implements Element {

        @Override
        public void accept(Visitor v) {

            v.visit(this);
        }

        public String getType() {
            return "FOO";
        }

    }

    static class BAR implements Element {

        @Override
        public void accept(Visitor v) {

            v.visit(this);
        }

        public String getType() {
            return "BAR";
        }

    }

    static class BAZ implements Element {

        @Override
        public void accept(Visitor v) {

            v.visit(this);
        }

        public String getType() {
            return "BAZ";
        }

    }

    static class COMP implements Element {

        ArrayList<Element> elems = new ArrayList<Element>();

        public void add(Element element) {
            elems.add(element);
        }

        @Override
        public void accept(Visitor v) {
            v.visit(this); // MOST IMPORTANT: XUAT COMP RA TRUOC BAR BAZ FOO
            for (Element e : elems) {
                e.accept(v);
            }
        }

        public String getType() {
            return "COMP";
        }

    }

    public static void main(String[] args) {
        COMP comp = new COMP();
        comp.add(new BAR());
        comp.add(new BAZ());
        comp.add(new FOO());

        Element[] list2 = { new FOO(), new BAR(), new BAZ(), comp };

        PlainVisitor plain = new PlainVisitor();
        for (Element element : list2) {
            element.accept(plain);
        }
    }
}
