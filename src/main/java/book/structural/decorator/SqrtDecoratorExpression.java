package book.structural.decorator;

public class SqrtDecoratorExpression extends AbstractDecoratorExpression{

    public SqrtDecoratorExpression() {
        super();
    }

    public SqrtDecoratorExpression(AbstractExpression expression) {
        super(expression);
    }

    @Override
    public double operate() {
        return Math.sqrt(expression.operate());
    }
}
