package builder;

public class Client {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 20;

        AbstractOperationBuilder[] operationBuilders = new AbstractOperationBuilder[4];

        operationBuilders[0] = new AddOperationBuilder(firstNumber, secondNumber);
        operationBuilders[1] = new SubstractOperationBuilder(firstNumber, secondNumber);
        operationBuilders[2] = new MultiplyOperationBuilder(firstNumber, secondNumber);
        operationBuilders[3] = new DivideOperationBuilder(firstNumber, secondNumber);

        for(int i=0; i < operationBuilders.length; i++){
            OperationDirector operationDirector = new OperationDirector(operationBuilders[i]);
            operationDirector.construct();
        }
    }
}
