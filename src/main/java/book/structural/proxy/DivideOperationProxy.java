package book.structural.proxy;
import javax.management.OperationsException;

public class DivideOperationProxy extends AbstractOperationSubject {

    private AbstractOperationSubject operationSubject;

    public DivideOperationProxy(AbstractOperationSubject operationSubject) {
        this.operationSubject = operationSubject;
    }

    @Override
    public int operate(int firstNumber, int secondNumber) throws OperationException {
        if(secondNumber == 0){
            throw new OperationException("NonZeroDivideException");
        }
        return operationSubject.operate(firstNumber, secondNumber);
    }
}
