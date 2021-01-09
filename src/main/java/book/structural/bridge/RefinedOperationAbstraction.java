package book.structural.bridge;

public class RefinedOperationAbstraction extends OperationAbstraction{
    public RefinedOperationAbstraction(BaseOperationImplementor baseOperationImplementor) {
        super(baseOperationImplementor);
    }

    public int sqrt(int value) {
        return (int) Math.sqrt(value);
    }

    public int pow(int value1, int value2){
        return (int) Math.pow(value1, value2);
    }
}
