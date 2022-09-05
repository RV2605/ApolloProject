public class Fibi {
    public static void main(String[] args) {
        int number=10;
        int firstNumber =0;
        int secondNumber =1;
        for (int k=0; k<=number;k++){
            System.out.println(firstNumber);

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

        }
    }
}
