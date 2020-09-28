package behavioral_pattern.chain_of_responsability;

public class OrcSoldier extends RequestHandler {
    public OrcSoldier(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.COLLECT_TAX == request.getRequestType()) {
            printHandling(request);
            request.markHandled();
        }
        super.handleRequest(request);
    }

    @Override
    public String toString() {
        return "Orc Soldier";
    }
}
