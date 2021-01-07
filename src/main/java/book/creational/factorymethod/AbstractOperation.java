package book.creational.factorymethod;

public abstract class AbstractOperation {
    private int firstNumber;
    private int secondNumber;

    public final void operate(){
        int firstNumber = getFirstNumber();
        int secondNumber = getSecondNumber();

        AbstractOperator operator = getOperator();

        String operatorDescription = operator.getDescription();

        int answer = operator.getAnswer(firstNumber, secondNumber);

        String result = firstNumber + operatorDescription + secondNumber + " = " + answer;

        print(result);
    }

    protected abstract AbstractOperator getOperator();

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    private void print(String result){
        System.out.println("result = " + result);
    }
}
