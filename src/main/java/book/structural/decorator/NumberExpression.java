package book.structural.decorator;

public class NumberExpression extends AbstractExpression {

    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public double operate() {
        return value;
    }
}
