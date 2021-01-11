package book.structural.decorator;

public class FracDecoratorExpression extends AbstractDecoratorExpression{


    public FracDecoratorExpression() {
        super();
    }

    public FracDecoratorExpression(AbstractExpression expression) {
        super(expression);
    }

    @Override
    public double operate() {
        return 1 / expression.operate() ;
    }
}
