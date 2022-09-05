import java.lang.String;
import java.util.Arrays;

public class NewDemo {

    public static void main(String[] args) {
        String [] arr1= {"vinoth","Kannan"};
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(arr1);
       String s = "polynomial";
        //System.out.println(s.toUpperCase());
        reverse(s );
    }

    public static void reverse(String f){
        String [] pally;
        int a = f.length();
       // System.out.println(a);
        pally = f.split("");
       System.out.println(Arrays.toString(pally));
        String reverse="";


        for (int i =(pally.length-1); i>=0 ; i--){

            reverse =reverse.concat(pally[i]);
            //System.out.print(val);
        }
        System.out.println(reverse);
        if ( reverse.equals(f)){

            System.out.println("it is a palindrome");

        }
        else {
            System.out.println("the given word "+f+ " is not an palindrome");
        }


    }
}
