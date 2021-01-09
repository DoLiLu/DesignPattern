package book.structural.bridge;

public class OperationAbstraction {

    private BaseOperationImplementor baseOperationImplementor;

    public OperationAbstraction(BaseOperationImplementor baseOperationImplementor) {
        this.baseOperationImplementor = baseOperationImplementor;
    }

    public int add(int firstNumber, int secondNumber){
        return this.baseOperationImplementor.add(firstNumber, secondNumber);
    }

    public int subtract(int firstNumber, int secondNumber){
        return this.baseOperationImplementor.subtract(firstNumber, secondNumber);
    }

    public int multiply(int firstNumber, int secondNumber){
        return this.baseOperationImplementor.multiply(firstNumber, secondNumber);
    }

    public int divide(int firstNumber, int secondNumber){
        return this.baseOperationImplementor.divide(firstNumber, secondNumber);
    }
}
