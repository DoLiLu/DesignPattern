package book.behavior.chainofresponsibillity;

public class Client {
    public static void main(String[] args) {
        AbstractOperationHandler addOperationHandler = new AddOperationHandler("+");
        AbstractOperationHandler subtractOperationHandler = new SubtractOperationHandler("-");
        AbstractOperationHandler multiplyOperationHandler = new MultiplyOperationHandler("*");
        AbstractOperationHandler divideOperationHandler = new DivideOperationHandler("/");

        addOperationHandler.setNext(subtractOperationHandler)
                .setNext(multiplyOperationHandler)
                .setNext(divideOperationHandler);

        Request[] requests = { new Request("100+20"),new Request("100-20"),
                                new Request("100*20"), new Request("100/20") };

        for (int i = 0; i < requests.length; i++) {
            int answer = addOperationHandler.handleRequest(requests[i]);
            String expression = requests[i].getExpression();

            System.out.println(expression + " = " + answer);

        }

    }
}
