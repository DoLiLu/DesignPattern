package book.structural.composite;

public class AddOperationExpression extends AbstractOperationExpression{

    public int operate(){
        AbstractExpression firstOperandExpression = operandList.get(0);
        AbstractExpression secondOperandExpression = operandList.get(1);

        int firstResult = firstOperandExpression.operate();
        int secondResult = secondOperandExpression.operate();

        return firstResult + secondResult;
    }
}
