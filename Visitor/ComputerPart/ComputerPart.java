package Visitor.ComputerPart;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}