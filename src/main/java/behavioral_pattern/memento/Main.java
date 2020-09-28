package behavioral_pattern.memento;

/* Memento Pattern: we use this pattern to create undo mechanisms in our classes
* Intent
    Without violating encapsulation, capture and externalize an object's internal state so that the object
    can be returned to this state later.
    A magic cookie that encapsulates a "check point" capability.
    Promote undo or rollback to full object status.

  Problem
    Need to restore an object back to its previous state (e.g. "undo" or "rollback" operations).

  The Memento design pattern defines three distinct roles:
    Originator (Editor class) - the object that knows how to save itself.
    Memento (EditorState class) - the lock box that is written and read by the Originator, and shepherded by the Caretaker.
    Caretaker (History class) - the object that knows why and when the Originator needs to save and restore itself.

   https://www.dofactory.com/images/diagrams/net/memento.gif

* */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
