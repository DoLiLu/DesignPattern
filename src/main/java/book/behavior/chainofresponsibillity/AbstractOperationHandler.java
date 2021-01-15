package book.behavior.chainofresponsibillity;

public abstract class AbstractOperationHandler {

    private String operator;
    private AbstractOperationHandler next;

    public AbstractOperationHandler(String name) {
        this.operator = name;
    }

    public AbstractOperationHandler setNext(AbstractOperationHandler next) {
        this.next = next;
        return next;
    }

    public final int handleRequest(Request request){
        if(resolve(request)){
            int result = operate(request);
            return result;
        } else if(next != null){
            return next.handleRequest(request);
        } else {
            handleFail(request);
            return 0;
        }
    }

    private void handleFail(Request request){
        System.out.println("fail");
    }

    protected final String getOperator(){
        return operator;
    }

    protected abstract int operate(Request request);

    private boolean resolve(Request request){
        if(request.getExpression().indexOf(getOperator()) >= 0)
            return true;


        return false;
    }
}

