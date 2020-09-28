package structural_patterns.proxy;

/*
* Now we want to provide only admin users to have full access of above class,
* if the user is not admin then only limited commands will be allowed. Here is our very simple proxy class implementation.
* */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private final CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("myname".equals(user) && "J@ournalD$v".equals(pwd)) isAdmin = true;
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            commandExecutor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) throw new Exception("rm command is not allowed for non-admin users");
            else
                commandExecutor.runCommand(cmd);
        }
    }
}
