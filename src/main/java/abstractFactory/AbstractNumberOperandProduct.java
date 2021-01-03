package abstractFactory;

public abstract class AbstractNumberOperandProduct {
    private String value;

    public AbstractNumberOperandProduct(String value) {
        this.value = value;
    }

    public abstract double getNumber();

    public String getValue() {
        return value;
    }
}
