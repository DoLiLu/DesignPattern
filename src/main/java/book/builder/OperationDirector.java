package book.builder;

public class OperationDirector {
    private AbstractOperationBuilder builder;

    public OperationDirector(AbstractOperationBuilder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildFirstNumber();
        builder.buildOperator();
        builder.buildSecondNumber();
        builder.buildAnswer();

        StringBuffer result = builder.getResult();

        print(result);
    }

    private void print(StringBuffer result) {
        System.out.println("result = " + result);
    }
}
