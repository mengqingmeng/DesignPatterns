import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A:");
        double numberA = scanner.nextDouble();
        System.out.println("请输入操作(+/-):");
        String operator = scanner.next();
        System.out.println("请输入数字B:");
        double numberB = scanner.nextDouble();

        // 使用特定的方法创建对象，类似工厂生产内容，根据参数生产出不同的东西
        IOperation op = OperationFactory.createOperation(operator);
        double result = op.getResult(numberA,numberB);
        System.out.println("result: " + result);
    }
}
