package book.prototype;

public class SubtractOperationPrototype extends AbstractOperationPrototype{

    public SubtractOperationPrototype() {
        super();
    }

    public SubtractOperationPrototype(AbstractOperationPrototype operation) {
        super(operation);
    }

    @Override
    public AbstractOperationPrototype getClone() {
        return new SubtractOperationPrototype(this);
    }

    @Override
    protected int getAnswer(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    protected String getOperator() {
        return " - ";
    }
}
