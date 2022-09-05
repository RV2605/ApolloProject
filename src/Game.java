import java.util.Scanner;

public class Game {


    public static void main(String[] args) {
        int random = (int) (Math.random()*100);
        System.out.println(random);

        boolean flag =true;
        while (flag){
            System.out.println("Guess the number");
            Scanner sc = new Scanner(System.in);
            int guess =sc.nextInt();
            if (guess == random){
                System.out.println("congratulations you guessed");
                flag=false;
            }
            else {
                System.out.println(" thats a wrong guess");
                if(guess > random){
                    System.out.println("HINT: number is lesser than your guess");
                }
                else {
                    System.out.println("HINT: number is grater than your guess");
                }
            }

        }
    }
}
