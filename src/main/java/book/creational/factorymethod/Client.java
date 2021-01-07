package book.creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 20;

        AbstractOperation[] operations =
                { new AddOperation(), new SubtractOperation(), new MultiplyOperation(), new DivideOperation()};

        for(int i = 0; i < operations.length; i++){
            operations[i].setFirstNumber(firstNumber);
            operations[i].setSecondNumber(secondNumber);

            operations[i].operate();
        }
    }
}
