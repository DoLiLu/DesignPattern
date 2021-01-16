package book.behavior.command;

public abstract class AbstractOperationCommand {

    protected OperationCommandReceiver receiver;
    protected int value;

    public AbstractOperationCommand(OperationCommandReceiver receiver, int value) {
        this.receiver = receiver;
        this.value = value;
    }

    public abstract void execute();
}
