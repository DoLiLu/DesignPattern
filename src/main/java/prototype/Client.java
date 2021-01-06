package prototype;

import java.util.HashMap;

public class Client {
    private AbstractOperationPrototype operationPrototype;

    private HashMap<String, AbstractOperationPrototype> operationPrototypeMap;

    public Client() {
        super();
        initOperationMap();
    }

    public void operate(){
        operationPrototype.operate();
    }

    public void setOperation(String operator, int firstNumber, int secondNumber){
        operationPrototype = getOperationClone(operator);
        operationPrototype.setFirstNumber(firstNumber);
        operationPrototype.setSecondNumber(secondNumber);
    }

    private AbstractOperationPrototype getOperationClone(String operator) {
        AbstractOperationPrototype operation = operationPrototypeMap.get(operator);
        return operation.getClone();
    }

    private void initOperationMap() {
        operationPrototypeMap = new HashMap<>();
        operationPrototypeMap.put("+", new AddOperationPrototype());
        operationPrototypeMap.put("-", new SubtractOperationPrototype());
        operationPrototypeMap.put("*", new MultiplyOperationPrototype());
        operationPrototypeMap.put("/", new DivideOperationPrototype());
    }

    public static void main(String[] args) {
        Client client = new Client();

        int firstNumber = 100;
        int secondNumber = 20;

        String[] operators = {"+", "-", "*", "/"};

        for (String operator : operators) {
            client.setOperation(operator, firstNumber, secondNumber);
            client.operate();
        }
    }
}
