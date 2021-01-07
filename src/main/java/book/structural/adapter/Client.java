package book.structural.adapter;

public class Client {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 20;

        AbstractOperationTarget operationTarget = new AddOperation();
        int answer = operationTarget.operate(firstNumber, secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + answer);

        operationTarget = new SubtractOperation();
        answer = operationTarget.operate(firstNumber, secondNumber);
        System.out.println(firstNumber + " - " + secondNumber + " = " + answer);


        operationTarget = new MuiltiplyOperation();
        answer = operationTarget.operate(firstNumber, secondNumber);
        System.out.println(firstNumber + " * " + secondNumber + " = " + answer);


        operationTarget = new DivideOperationAdapter(new OperationAdaptee());
        answer = operationTarget.operate(firstNumber, secondNumber);
        System.out.println(firstNumber + " / " + secondNumber + " = " + answer);

    }
}
