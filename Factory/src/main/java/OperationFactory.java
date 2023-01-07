public class OperationFactory {
    public static IOperation createOperation(String operate){
        IOperation operation = null;
        switch(operate){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            default:
                throw new ArithmeticException("Invalid operation");
        }
        return operation;
    }
}
