package book.behavior.visitor.expression;


import book.behavior.visitor.AbstractVisitor;

public class VariableExpression extends AbstractExpression {

	private final String name;
	private int value;

	public VariableExpression(String name) {
		this.name = name;
	}

	public int operate() {
		return this.value;
	}

	@Override
	public void accept(AbstractVisitor v) {
		v.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
