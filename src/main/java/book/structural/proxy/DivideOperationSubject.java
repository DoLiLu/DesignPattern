package book.structural.proxy;

import javax.management.OperationsException;

public class DivideOperationSubject extends AbstractOperationSubject {
    @Override
    public int operate(int firstNumber, int secondNumber) throws OperationException {
        return firstNumber / secondNumber;
    }
}
