package behavioral_pattern.state.abuse_state_pattern;

public class StopWatch {
    private State currentState = new StoppedState(this);

    public void click() {
        currentState.click();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
