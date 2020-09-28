package behavioral_pattern.chain_of_responsability;

import java.util.Objects;

public class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void markHandled() {this.handled = true;}

    public boolean isHandled() {
        return handled;
    }
    @Override
    public String toString() {
        return getRequestDescription();
    }
}
