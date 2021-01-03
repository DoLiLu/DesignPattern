package abstractFactory;

public class DoubleOperationProduct extends AbstractOperationProduct {
    @Override
    public void print() {
        double firstNumber = getFirstNumber();
        double secondNumber = getSecondNumber();

        System.out.println(firstNumber + " + " + secondNumber + " = " + add());
        System.out.println(firstNumber + " - " + secondNumber + " = " + substract());
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply());
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide());
    }
}
