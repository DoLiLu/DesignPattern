package book.structural.adapter;

public class MuiltiplyOperation extends AbstractOperationTarget{

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
