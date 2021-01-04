package factorymethod;

public class SubtractOperation extends AbstractOperation{
    @Override
    protected AbstractOperator getOperator() {
        return new SubtractOperator();
    }
}
