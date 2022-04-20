/*
This is 1st Observer 
*/

package Observer.Exam;

public class ReceivedResponse implements Observer, DisplayMethod {
    private String lineSourceScanner;
    private Subject lineSource;

    public ReceivedResponse(Subject lineSource) {
        this.lineSource = lineSource;
        lineSource.addObserver(this);
    }

    public void update(String lineSourceScanner) {
        this.lineSourceScanner = lineSourceScanner;
        display();
    }

    public void display() {
        System.out.println("Received Response: " + lineSourceScanner);
    }
}
