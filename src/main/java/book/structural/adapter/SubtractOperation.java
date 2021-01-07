package book.structural.adapter;

public class SubtractOperation extends AbstractOperationTarget{

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
