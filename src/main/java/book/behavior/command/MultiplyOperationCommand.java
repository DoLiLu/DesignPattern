package book.behavior.command;

public class MultiplyOperationCommand extends AbstractOperationCommand{

    public MultiplyOperationCommand(OperationCommandReceiver receiver, int value) {
        super(receiver, value);
    }

    @Override
    public void execute() {
        receiver.multiply(value);
    }
}
