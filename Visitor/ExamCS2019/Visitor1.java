// public class Visitor1 {
// public interface VisitorIntf {
// void visit(FOO foo);

// void visit(BAR bar);

// void visit(BAZ baz);
// }

// static class PlainVisitor implements VisitorIntf {

// @Override
// public void visit(FOO foo) {
// // TODO Auto-generated method stub
// System.out.println("plain: " + foo.getType());
// }

// @Override
// public void visit(BAR bar) {
// // TODO Auto-generated method stub
// System.out.println("plain: " + bar.getType());
// }

// @Override
// public void visit(BAZ baz) {
// // TODO Auto-generated method stub
// System.out.println("plain: " + baz.getType());
// }

// }

// static class StringFormatterVisitor implements VisitorIntf {
// Element[] list;

// public StringFormatterVisitor(Element[] list) {
// this.list = list;
// }

// @Override
// public void visit(FOO foo) {
// System.out.println("plain: " + foo.getType());
// }

// @Override
// public void visit(BAR bar) {
// System.out.println("plain: " + bar.getType());

// }

// @Override
// public void visit(BAZ baz) {
// System.out.println("plain: " + baz.getType());

// }

// public String reverseString() {
// String str;
// PlainVisitor plain = new PlainVisitor();
// for (Element element : list) {
// str += element.accept(plain);
// }

// }

// }

// public interface Element {
// void accept(VisitorIntf v);
// }

// static class BAR implements Element {

// @Override
// public void accept(VisitorIntf v) {
// v.visit(this);
// }

// public String getType() {
// return "BAR";
// }

// }

// static class BAZ implements Element {

// @Override
// public void accept(VisitorIntf v) {
// v.visit(this);
// }

// public String getType() {
// return "BAZ";
// }

// }

// static class FOO implements Element {

// @Override
// public void accept(VisitorIntf v) {
// v.visit(this);
// }

// public String getType() {
// return "FOO";
// }

// }

// public static void main(String[] args) {
// Element[] list = { new FOO(), new BAR(), new BAZ() };
// PlainVisitor plain = new PlainVisitor();
// for (Element element : list) {
// element.accept(plain);
// }
// }
// }
