package book.structural.facade;

public class Client {
    public static void main(String[] args) {
        CalculatorFacade calculatorFacade = new CalculatorFacade();

        String[] expressions = {"100+20", "100-20", "100*20", "100/20"};

        for (String expression : expressions) {
            calculatorFacade.calculate(expression);
        }
    }
}
