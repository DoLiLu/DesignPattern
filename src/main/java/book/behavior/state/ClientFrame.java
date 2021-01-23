package book.behavior.state;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ClientFrame extends JFrame implements ActionListener, IContext {

	private JButton display;
	private JLabel lbCurrentState;

	private double result;
	private String lastOperator;

	private IState state;

	public ClientFrame() {
		setTitle("Calculator");

		JPanel calculatorPanel = new JPanel();

		initLayout(calculatorPanel);

		add(calculatorPanel);
		pack();
	}

	public void updateDisplay(String text) {
		display.setText(text);
	}

	public void appendInputToDisplay(String input) {
		updateDisplay(display.getText() + input);
	}

	public static void main(String[] args) {
		ClientFrame frame = new ClientFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void calculate() {
		calculate(lastOperator, Double.parseDouble(display.getText()));
	}

	private void calculate(String operator, double value) {
		if (operator.equals("+")) {
			result += value;
		} 
		else if (operator.equals("-")) {
			result -= value;
		} 
		else if (operator.equals("*")) {
			result *= value;
		} 
		else if (operator.equals("/")) {
			result /= value;
		} 
		else if (operator.equals("=")) {
			result = value;
		}

		updateDisplay("" + result);
	}

	private void addButton(JPanel panel, String label, ActionListener listener) {
		JButton button = new JButton(label);
		button.addActionListener(listener);
		panel.add(button);
	}

	private void initLayout(JPanel calculatorPanel) {
		calculatorPanel.setLayout(new BorderLayout());

		result = 0;
		lastOperator = "=";
		state = StartState.getInstance();
		
		display = new JButton("0");
		display.setEnabled(false);
		calculatorPanel.add(display, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));

		addButton(panel, "7", this);
		addButton(panel, "8", this);
		addButton(panel, "9", this);
		addButton(panel, "/", this);

		addButton(panel, "4", this);
		addButton(panel, "5", this);
		addButton(panel, "6", this);
		addButton(panel, "*", this);

		addButton(panel, "1", this);
		addButton(panel, "2", this);
		addButton(panel, "3", this);
		addButton(panel, "-", this);

		addButton(panel, "0", this);
		addButton(panel, ".", this);
		addButton(panel, "=", this);
		addButton(panel, "+", this);

		calculatorPanel.add(panel, BorderLayout.CENTER);

		lbCurrentState = new JLabel(state.toString());
		calculatorPanel.add(lbCurrentState, BorderLayout.SOUTH);
	}

	@Override
	public void changeState(IState state) {

		this.state = state;
		lbCurrentState.setText(state.toString());
	}

	public boolean isOperator(String actionCommand) {

		if (actionCommand.equals("+")) {
			return true;
		} 
		else if (actionCommand.equals("-")) {
			return true;
		} 
		else if (actionCommand.equals("*")) {
			return true;
		} 
		else if (actionCommand.equals("/")) {
			return true;
		}
		else if (actionCommand.equals("=")) {
			return true;
		}

		return false;
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		String actionCommand = event.getActionCommand();
		state.action(this, actionCommand);
	}

	public void setLastOperator(String lastCommand) {
		this.lastOperator = lastCommand;
	}
}