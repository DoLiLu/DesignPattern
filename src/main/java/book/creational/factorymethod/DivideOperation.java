package book.creational.factorymethod;

public class DivideOperation extends AbstractOperation{
    @Override
    protected AbstractOperator getOperator() {
        return new DivideOperator();
    }
}
