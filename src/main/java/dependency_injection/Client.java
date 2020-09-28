package dependency_injection;

public class Client {
    private Service service;

    public Client(Service service) {
        this.service = service;
    }

    public void doSomething() {
        service.write("This is a message now!");
    }
}
