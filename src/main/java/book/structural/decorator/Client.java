package book.structural.decorator;

public class Client {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int firstNumber = 80;
        int secondNumber = 20;

        NumberExpression firstNumberEquation = new NumberExpression(firstNumber);
        calculator.setExpression(firstNumberEquation);
        System.out.println("firstNumber = " + calculator.calculate());

        NumberExpression secondNumberEquation = new NumberExpression(secondNumber);
        calculator.setExpression(secondNumberEquation);
        System.out.println("secondNumber = " + calculator.calculate());

        AbstractOperationExpression addOperatorEquation = new AddOperationExpression();
        addOperatorEquation.addOperandExpression(firstNumberEquation);
        addOperatorEquation.addOperandExpression(secondNumberEquation);
        calculator.setExpression(addOperatorEquation);
        System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.calculate());

        calculator.setExpression(new SqrtDecoratorExpression(addOperatorEquation));
        System.out.println("SQRT(" + firstNumber + " + " + secondNumber + ") = " + calculator.calculate());

        calculator.setExpression(new FracDecoratorExpression(addOperatorEquation));
        System.out.println("FRAC(" + firstNumber + " + " + secondNumber + ") = " + calculator.calculate());

        int exponent = 2;
        calculator.setExpression(new PowDecoratorExpression(addOperatorEquation, exponent));
        System.out.println("POW(" + firstNumber + " + " + secondNumber + ") = " + calculator.calculate());
    }

}
