package behavioral_pattern.chain_of_responsability;

public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.TORTURE_PRISONER == request.getRequestType()) {
            printHandling(request);
            request.markHandled();
        }
        super.handleRequest(request);
    }

    @Override
    public String toString() {
        return "Orc Officer";
    }


}
