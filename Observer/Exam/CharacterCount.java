package Observer.Exam;

public class CharacterCount implements Observer, DisplayMethod {
    private String lineSourceScanner;
    private Subject lineSource;

    public CharacterCount(Subject lineSource) {
        this.lineSource = lineSource;
        lineSource.addObserver(this);
    }

    public void update(String lineSourceScanner) {
        this.lineSourceScanner = lineSourceScanner;
        display();
    }

    public void display() {
        System.out.println("Character count: " + lineSourceScanner.length());
    }
}
