package behavioral_pattern.chain_of_responsability;

public abstract class RequestHandler {

    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) next.handleRequest(request);
    }

    protected void printHandling(Request request) {
        System.out.printf("\n%s handling request \"%s\"", this, request);
    }

    @Override
    public abstract String toString();

}
