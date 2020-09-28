package behavioral_pattern.state;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selected Erase icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erased something");
    }
}
