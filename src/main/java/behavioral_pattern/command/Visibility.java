package behavioral_pattern.command;

public enum Visibility {
    VISIBLE("visible"),
    INVISIBLE("invisible");

    private final String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
