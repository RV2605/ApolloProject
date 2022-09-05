import java.lang.reflect.Method;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Enter the operation you like to perform: sum : sub : mul : div");
        Scanner mat =new Scanner(System.in);
        String op = mat.nextLine();
        System.out.println(op);
        Calculator ss = new Calculator();
        System.out.println("enter the first number");
        int val1= mat.nextInt();
        System.out.println("enter the second number");
        int val2 = mat.nextInt();

        switch (op) {
            case "sum" -> {
                double j = ss.sum(val1, val2);
                System.out.println(j);
            }
            case "sub" -> {
                double k = ss.difference(val1, val2);
                System.out.println(k);
            }
            case "mul" -> {
                double j = ss.multiply(val1, val2);
                System.out.println(j);
            }
            case "div" -> {
                double j = ss.divide(val1, val2);
                System.out.println(j);
            }
            default -> System.out.println("Enter proper operation");
        }



    }
    public  double sum(int a, int b){
        return a+b;

    }
    public double difference(int a, int b){
        return a-b;

    }
    public double multiply(int a, int b){
        return a*b;

    }
    public double divide(int a, int b){
    return a/b;
    }

}
