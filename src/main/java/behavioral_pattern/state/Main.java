package behavioral_pattern.state;
/*
State Pattern: The main idea of State pattern is to allow the object for changing its behavior without changing its class.
                Also, by implementing it, the code should remain cleaner without many if/else statements.
* Intent:
    Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
    An object-oriented state machine
    wrapper + polymorphic wrapper + collaboration

  Problem:
   A monolithic object's behavior is a function of its state, and it must change its behavior at run-time depending
   on that state. Or, an application is characterized by large and numerous case statements that vector
   flow of control based on the state of the application.

* */
public class Main {
    public static void main(String[] args) {

        Canvas canvas1 = new Canvas();
        canvas1.setCurrentTool(new SelectionTool());
        canvas1.mouseDown();
        canvas1.mouseUp();

        System.out.println("----------------------------------------");

        Canvas canvas2 = new Canvas();
        canvas2.setCurrentTool(new BrushTool());
        canvas2.mouseDown();
        canvas2.mouseUp();

        System.out.println("----------------------------------------");

        Canvas canvas3 = new Canvas();
        canvas3.setCurrentTool(new EraserTool());
        canvas3.mouseDown();
        canvas3.mouseUp();
    }
}
