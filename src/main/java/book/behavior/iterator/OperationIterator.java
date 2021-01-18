package book.behavior.iterator;

public class OperationIterator implements ICalcIterator {

	private OperationAggregate operationAggregate;
	private int index;

	public OperationIterator(OperationAggregate operationAggregate) {
		this.operationAggregate = operationAggregate;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < operationAggregate.getSize())
			return true;
		else
			return false;
	}

	@Override
	public AbstractOperation next() {
		AbstractOperation operation = operationAggregate.getOperationAt(index);
		index++;
		return operation;
	}

}
