import java.util.Scanner;
public class Star {

    public static void main(String[] args) {
        System.out.println("enter the number of * you want");
        Scanner data = new Scanner(System.in);

        int k = data.nextInt();
        Star s = new Star();
        s.invert(k);
        s.pyramid(k);
    }
    public void invert(int n){
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public void  pyramid(int l){
        for(int i =1; i<=l; i++){
            for(int m =l; m>=i ; m--){

                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");

        }

    }
}
