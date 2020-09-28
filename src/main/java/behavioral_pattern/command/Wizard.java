package behavioral_pattern.command;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {
    private final Deque<Command> undoStack = new LinkedList<>();
    private final Deque<Command> redoStack = new LinkedList<>();

    public Wizard() {
        // comment
    }

    public void castSpell(Command command, Target target) {
        System.out.printf("\n%s casts %s", this, command, target);
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if(!undoStack.isEmpty()) {
            var previousSpell = undoStack.pollLast(); // retrieves and removes last element from deque
            redoStack.offerLast(previousSpell); // add this element at the end of this deque unless it would violate capacity restrictions
            System.out.printf("\n%s undoes %s", this, previousSpell);
            previousSpell.undo();
        }
    }

    public void redoLastSpell() {
        if(!redoStack.isEmpty()) {
            var previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            System.out.printf("\n%s redoes %s", this, previousSpell);
            previousSpell.redo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
