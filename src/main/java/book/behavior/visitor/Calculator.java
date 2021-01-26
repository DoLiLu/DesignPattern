package book.behavior.visitor;

import book.behavior.visitor.expression.AbstractExpression;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Calculator {

	private AbstractExpression expression;

	private final HashMap<String, Integer> variableToValueMap = new HashMap<String, Integer>();

	public Calculator() {
		super();
	}

	public int calculate() {
		if (expression != null) {

			Set<String> keySet = variableToValueMap.keySet();

			Iterator<String> it = keySet.iterator();
			String variableName;
			Integer value;
			while (it.hasNext()) {
				variableName = it.next();
				value = variableToValueMap.get(variableName);

				SetValueToVariableVisitor setValueToVariableVisitor = new SetValueToVariableVisitor(variableName, value);

				expression.accept(setValueToVariableVisitor);
			}

			return expression.operate();
		}
		
		return 0;
	}

	public void setExpression(AbstractExpression expression) {
		this.expression = expression;
	}

	public void addVariableToValue(String variableName, int value) {
		variableToValueMap.put(variableName, value);
	}

}
