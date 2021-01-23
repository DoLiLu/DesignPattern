package book.behavior.state;

public interface IContext {

	void changeState(IState state);
	void updateDisplay(String text);
	void appendInputToDisplay(String input);
	void calculate();
	void setLastOperator(String lastCommand);
	boolean isOperator(String actionCommand);

}
