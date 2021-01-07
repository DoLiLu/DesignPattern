package book.creational.abstractfactory;

public class DoubleNumberOperandProduct extends AbstractNumberOperandProduct {
    public DoubleNumberOperandProduct(String value) {
        super(value);
    }

    @Override
    public double getNumber() {
        String value = getValue();
        return Double.parseDouble(value);
    }
}
