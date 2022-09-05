import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
    //marks();
        dd();
    }
    public static void marks( ){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int total =0;
        int average =0;
        for (int i =0; i<arr.length; i++){
            System.out.println("Enter the marks");


            arr[i]= sc.nextInt();
            total = total+arr[i];
        }
        average = total/arr.length;
        System.out.println("the average of the student is "+average);
        System.out.println(Arrays.toString(arr));
        System.out.println("the total marks are "+total);

    }
    public static void dd(){
        int [][] arr2d = { {10,20,30,40,50},
                           {20,30,40,50,60},
                            {30,40,50,60,70}
        };
        int [] arr = new int [5];
        int sum;
       // Scanner sc = new Scanner(System.in);
        for ( int i=0; i<arr2d.length; i++){
            sum=0;
            for (int j=0; j<arr2d[0].length; j++){

                sum = sum +arr2d[i][j];
                arr[j] = arr2d[i][j];


            }
            System.out.println("the individual mark of student no "+(i+1)+": "+Arrays.toString(arr));

            System.out.println("the total mark for the student no "+(i+1)+" : " +sum);
            System.out.println("------------------------------------------------------------------");


        }
        int total;
    //--------------------------------------------------------------------------------------
        for (int col =0; col < arr2d[0].length; col++){
            total=0;

            for (int row =0; row<arr2d.length; row++){

                total=total+arr2d[row][col];

            }
            int col_average=total/ arr2d.length;
            System.out.println("the average of each column :"+col_average);
            col_average=0;

        }
        char [] arr1 = {'v','i','n','o','t','h'};
        System.out.println(Arrays.toString(arr1));



    }
}
