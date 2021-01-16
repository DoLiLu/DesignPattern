package book.behavior.command;

public class Client {

    public static void main(String[] args) {
        OperationCommandReceiver receiver = new OperationCommandReceiver();
        int result = receiver.getResult();

        System.out.println("result = " + result);

        AddOperationCommand addOperationCommand = new AddOperationCommand(receiver, 20);
        addOperationCommand.execute();
        result = receiver.getResult();
        System.out.println("result + 20 = " + result);


        SubtractOperationCommand subtractOperationCommand = new SubtractOperationCommand(receiver, 10);
        subtractOperationCommand.execute();
        result = receiver.getResult();
        System.out.println("result - 10 = " + result);

        MultiplyOperationCommand multiplyOperationCommand = new MultiplyOperationCommand(receiver, 10);
        multiplyOperationCommand.execute();
        result = receiver.getResult();
        System.out.println("result * 10 = " + result);


        DivideOperationCommand divideOperationCommand = new DivideOperationCommand(receiver, 10);
        divideOperationCommand.execute();
        result = receiver.getResult();
        System.out.println("result / 10 = " + result);
    }
}
