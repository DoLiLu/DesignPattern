package book.structural.decorator;

public abstract class AbstractDecoratorExpression extends AbstractExpression{

    protected AbstractExpression expression;

    public AbstractDecoratorExpression() {
        super();
    }

    public AbstractDecoratorExpression(AbstractExpression expression) {
        this.expression = expression;
    }

    public void setExpression(AbstractExpression expression) {
        this.expression = expression;
    }
}
