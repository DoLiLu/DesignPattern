package book.structural.bridge;

public class BaseOperation implements BaseOperationImplementor{
    @Override
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
