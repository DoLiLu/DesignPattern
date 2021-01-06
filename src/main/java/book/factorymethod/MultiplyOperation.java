package book.factorymethod;

public class MultiplyOperation extends AbstractOperation{
    @Override
    protected AbstractOperator getOperator() {
        return new MultiplyOperator();
    }
}
