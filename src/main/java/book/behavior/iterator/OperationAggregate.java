package book.behavior.iterator;

import java.util.ArrayList;

public class OperationAggregate extends AbstractAggregate {

	private ArrayList<AbstractOperation> operations = new ArrayList<AbstractOperation>();

	public OperationAggregate() {
		super();
	}

	public void addOperation(AbstractOperation operation) {
		operations.add(operation);
	}

	@Override
	public ICalcIterator createIterator() {
		return new OperationIterator(this);
	}

	public AbstractOperation getOperationAt(int index) {
		return operations.get(index);
	}

	public int getSize() {
		return operations.size();
	}
}
