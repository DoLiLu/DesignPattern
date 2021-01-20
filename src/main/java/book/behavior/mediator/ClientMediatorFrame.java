package book.behavior.mediator;

import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JFrame;

public class ClientMediatorFrame extends JFrame implements IMediator {

	private final AddColleaguePanel addColleaguePanel = new AddColleaguePanel();
	private final SubtractColleaguePanel subtractColleaguePanel = new SubtractColleaguePanel();
	private final MultiplyColleaguePanel multiplyColleaguePanel = new MultiplyColleaguePanel();
	private final DivideColleaguePanel divideColleaguePanel = new DivideColleaguePanel();

	public ClientMediatorFrame() {

		setTitle("Calculator");

		setLayout(new GridLayout(4, 1));

		add(addColleaguePanel);
		add(subtractColleaguePanel);
		add(multiplyColleaguePanel);
		add(divideColleaguePanel);

		createColleagues();
		
		colleagueChanged(addColleaguePanel);
		colleagueChanged(subtractColleaguePanel);
		colleagueChanged(multiplyColleaguePanel);
		colleagueChanged(divideColleaguePanel);

		setLocation(new Point(100, 100));

		pack();
	}

	public static void main(String[] args) {
		ClientMediatorFrame frame = new ClientMediatorFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void createColleagues() {
		addColleaguePanel.setMediator(this);
		subtractColleaguePanel.setMediator(this);
		multiplyColleaguePanel.setMediator(this);
		divideColleaguePanel.setMediator(this);
	}

	@Override
	public void colleagueChanged(IColleague colleague) {		
		int firstNumber = colleague.getFirstNumber();
		int secondNumber = colleague.getSecondNumber();
		
		addColleaguePanel.setFirstNumber(firstNumber);
		addColleaguePanel.setSecondNumber(secondNumber);
		
		addColleaguePanel.printAnswer(firstNumber + secondNumber);
		
		subtractColleaguePanel.setFirstNumber(firstNumber);
		subtractColleaguePanel.setSecondNumber(secondNumber);
		
		subtractColleaguePanel.printAnswer(firstNumber - secondNumber);
		
		multiplyColleaguePanel.setFirstNumber(firstNumber);
		multiplyColleaguePanel.setSecondNumber(secondNumber);
		
		multiplyColleaguePanel.printAnswer(firstNumber * secondNumber);
		
		divideColleaguePanel.setFirstNumber(firstNumber);
		divideColleaguePanel.setSecondNumber(secondNumber);
		
		divideColleaguePanel.printAnswer(firstNumber / secondNumber);			
	}
}