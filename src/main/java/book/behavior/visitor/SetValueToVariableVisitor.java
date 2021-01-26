package book.behavior.visitor;

import book.behavior.visitor.expression.AbstractExpression;
import book.behavior.visitor.expression.VariableExpression;

public class SetValueToVariableVisitor extends AbstractVisitor {

	private final String variableName;
	private final int value;

	public SetValueToVariableVisitor(String variableName, int value) {
		this.variableName = variableName;
		this.value = value;
	}

	@Override
	public void visit(AbstractExpression expression) {
		VariableExpression variableExpression = (VariableExpression) expression;
		
		if (variableExpression.getName().equals(variableName)) {
			variableExpression.setValue(value);
		}
	}

}
