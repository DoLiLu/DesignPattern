package book.behavior.chainofresponsibillity;

public class Request {
    private String expression;

    public Request(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public int getFirstNumber(String operator){
        return Integer.parseInt(expression.substring(0, expression.indexOf(operator)));
    }

    public int getSecondNumber(String operator){
        return Integer.parseInt(expression.substring(expression.indexOf(operator) + 1));
    }
}
