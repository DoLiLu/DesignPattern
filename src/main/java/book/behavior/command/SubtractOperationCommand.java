package book.behavior.command;

public class SubtractOperationCommand extends AbstractOperationCommand{

    public SubtractOperationCommand(OperationCommandReceiver receiver, int value) {
        super(receiver, value);
    }

    @Override
    public void execute() {
        receiver.subtract(value);
    }
}
