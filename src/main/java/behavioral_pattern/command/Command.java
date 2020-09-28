package behavioral_pattern.command;

public interface Command {
    void execute(Target target);
    void undo();
    void redo();

    String toString();
}
