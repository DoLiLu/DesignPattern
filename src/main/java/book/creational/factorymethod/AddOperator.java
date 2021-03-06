package book.creational.factorymethod;

public class AddOperator extends AbstractOperator{

    @Override
    protected int getAnswer(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public String getDescription() {
        return " + ";
    }
}
