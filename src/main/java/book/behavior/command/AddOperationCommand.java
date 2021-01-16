package book.behavior.command;

public class AddOperationCommand extends AbstractOperationCommand{

    public AddOperationCommand(OperationCommandReceiver receiver, int value) {
        super(receiver, value);
    }

    @Override
    public void execute() {
        receiver.add(value);
    }
}
