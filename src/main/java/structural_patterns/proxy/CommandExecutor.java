package structural_patterns.proxy;

public interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}
