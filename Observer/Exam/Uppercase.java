package Observer.Exam;

public class Uppercase implements Observer, DisplayMethod {
    private String lineSourceScanner;
    private Subject lineSource;

    public Uppercase(Subject lineSource) {
        this.lineSource = lineSource;
        lineSource.addObserver(this);
    }

    public void update(String lineSourceScanner) {
        this.lineSourceScanner = lineSourceScanner;
        display();
    }

    public void display() {
        System.out.println("Uppercase: " + lineSourceScanner.toUpperCase());
    }
}
