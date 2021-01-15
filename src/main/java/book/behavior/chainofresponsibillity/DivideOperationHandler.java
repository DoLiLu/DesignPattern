package book.behavior.chainofresponsibillity;

public class DivideOperationHandler extends AbstractOperationHandler{

    public DivideOperationHandler(String name) {
        super(name);
    }

    @Override
    protected int operate(Request request) {
        String operator = getOperator();

        int firstNumber = request.getFirstNumber(operator);
        int secondNumber = request.getSecondNumber(operator);
        return firstNumber / secondNumber;
    }
}
