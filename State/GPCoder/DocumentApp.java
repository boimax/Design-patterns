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

        public void setState(State state) { // MOST IMPORTANT
            this.state = state;
        }

        public void applyState() {
            state.handleRequest();
        }
    }

    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();
        context.setState(new NewState());
        context.applyState();

        context.setState(new SubmittedState());
        context.applyState();

        context.setState(new ApprovedState());
        context.applyState();

        context.setState(new RejectedState());
        context.applyState();
    }
}
