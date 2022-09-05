import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        System.out.println("hello enter the age");
        int age;
        Scanner input= new Scanner(System.in);
        age= input.nextInt();
        System.out.println("your age is:"+age);
        for(int i =10; i>1 ; i--) {
            System.out.println("the value of i is:"+i);
        }
       // for(;;){
        //    System.out.println("for loop");
        //}

    }



}