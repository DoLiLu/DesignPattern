package book.structural.proxy;

public abstract class AbstractOperationSubject {
    public abstract int operate(int firstNumber, int secondNumber) throws OperationException;
}
