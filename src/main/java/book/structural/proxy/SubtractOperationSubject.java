package book.structural.proxy;

import javax.management.OperationsException;

public class SubtractOperationSubject extends AbstractOperationSubject {
    @Override
    public int operate(int firstNumber, int secondNumber) throws OperationException {
        return firstNumber - secondNumber;
    }
}
