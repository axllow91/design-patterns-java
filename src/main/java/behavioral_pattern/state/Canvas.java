package behavioral_pattern.state;

/*
* Our context is going to delegate the behavior to the state implementation.
*  In other words, all incoming requests will be handled by the concrete implementation of the state.
* */
public class Canvas {
    private Tool tool;

    public void mouseDown() {
        tool.mouseDown();
    }

    public void mouseUp() {
        tool.mouseUp();
    }

    public Tool getCurrentTool() {
        return tool;
    }

    public void setCurrentTool(Tool tool) {
       this.tool = tool;
    }
}
