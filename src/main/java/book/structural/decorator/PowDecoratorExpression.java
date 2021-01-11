package book.structural.decorator;

public class PowDecoratorExpression extends AbstractDecoratorExpression{

    private int exponent;

    public PowDecoratorExpression() {
        super();
    }

    public PowDecoratorExpression(AbstractExpression expression, int exponent) {
        super(expression);
        this.exponent = exponent;
    }

    @Override
    public double operate() {
        return Math.pow(this.expression.operate(), exponent);
    }
}
