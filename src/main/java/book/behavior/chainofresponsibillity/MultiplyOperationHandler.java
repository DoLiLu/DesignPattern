package book.behavior.chainofresponsibillity;

public class MultiplyOperationHandler extends AbstractOperationHandler{

    public MultiplyOperationHandler(String name) {
        super(name);
    }

    @Override
    protected int operate(Request request) {
        String operator = getOperator();

        int firstNumber = request.getFirstNumber(operator);
        int secondNumber = request.getSecondNumber(operator);
        return firstNumber * secondNumber;
    }
}
