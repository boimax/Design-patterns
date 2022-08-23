
/**
 * This is the implementation with the Observer to print number of character
 * Client will pass the servicer into the Observer in order to:
 * This can be register itselft to the serivce when it is ready => client can
 * add Observer dont need to care when it is ready
 * Observer can get the state from the serverice to execute correctly
 */
public class CountObserver extends Observer {

    // reciece the service from client
    public CountObserver(LineSourceService service) {
        super(service);

        // attach itself to the service
        // it can decide when it is ready to attach (maybe wait 1 minute than attach,
        // ...)
        service.attachObserver(this);
    }

    @Override
    public void start() {
        String line = service.getState(); // this will get the state from the Service
        System.out.println("Character count: " + line.length());
    }

}
