package book.behavior.command;

public class OperationCommandReceiver {

    private int result;

    public int getResult() {
        return result;
    }

    public void add(int value){
        result += value;
    }

    public void subtract(int value){
        result -= value;
    }

    public void multiply(int value){
        result *= value;
    }

    public void divide(int value){
        result /= value;
    }
}
