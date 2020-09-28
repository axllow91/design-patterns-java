package dependency_injection;

public class ServiceImpl implements Service {
    @Override
    public void write(String message) {
        System.out.println("Printing a message!");
    }
}
