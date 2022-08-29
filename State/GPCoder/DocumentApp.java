/*
 * 4 MAIN PARTS: 
 * - Context: setState() + handleRequest()
 * - interface State: handleRequest()
 * - concrete State: handleRequest()
 * - client: just use context to setState and do handleRequest()
 * *** IN SOME CASES => NEED TO NOTICE TO SET DEFAULT STATE AT THE BEGINNING LIKE IN THE STATE PROBLEM EXAMCS2018
 */
public class DocumentApp {
    public interface State {
        void handleRequest();
    }

    static class NewState implements State {

        @Override
        public void handleRequest() {

            System.out.println("Create a new document");
        }

    }

    static class SubmittedState implements State {

        @Override
        public void handleRequest() {

            System.out.println("Submitted");
        }

    }

    static class ApprovedState implements State {

        @Override
        public void handleRequest() {

            System.out.println("Approved");
        }

    }

    static class RejectedState implements State {

        @Override
        public void handleRequest() {

            System.out.println("Rejected");
        }

    }

    static class DocumentContext {
        State state;

        public void setState(State state) { // MOST IMPORTANT 1
            this.state = state;
        }

        public void handleRequest() { // MOST IMPORTANT 2
            state.handleRequest();
        }
    }

    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();
        context.setState(new NewState());
        context.handleRequest();

        context.setState(new SubmittedState());
        context.handleRequest();

        context.setState(new ApprovedState());
        context.handleRequest();

        context.setState(new RejectedState());
        context.handleRequest();

    }
}