package book.behavior.state;

public interface IState {
	void action(IContext context, String actionCommand);
}
