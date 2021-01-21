package book.behavior.memento;

public class OperationCaretaker {

	public static void main(String[] args) {

		OperationOriginator operationOriginator = new OperationOriginator();

		operationOriginator.setFirstNumber(100);
		operationOriginator.setSecondNumber(10);

		operationOriginator.printOperations();
		
		System.out.println("create Memento");

		OperationMemento operationMemento = operationOriginator.createMemento();

		operationOriginator.setFirstNumber(60);
		operationOriginator.setSecondNumber(30);

		operationOriginator.printOperations();
		
		System.out.println("restore Memento");

		operationOriginator.setMemento(operationMemento);

		operationOriginator.printOperations();

	}

}
