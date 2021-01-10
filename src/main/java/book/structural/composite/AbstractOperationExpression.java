package book.structural.composite;

import java.util.ArrayList;

public class AbstractOperationExpression extends AbstractExpression{

    protected ArrayList<AbstractExpression> operandList = new ArrayList<>();

    @Override
    public int operate() {
        return 0;
    }

    public final void addOperandExpression(AbstractExpression operandExpression){
        operandList.add(operandExpression);
    }
}
