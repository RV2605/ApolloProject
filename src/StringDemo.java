import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        //System.out.println(close10(13, 7));
        String s = "Adelitione";
        int d = s.indexOf("del");
        //System.out.println(d);
        int i = 7;
        int abs = Math.abs(i - 10);
        //System.out.println(abs);
        int i1 = i % 10;
        System.out.println(i1);


        if(s.contains("delt")){
      //  String c = String.valueOf(s.charAt(1));
        String[] split = s.split("del");
        //System.out.println(Arrays.toString(split));

       String s1= split[0]+ split[1];
        System.out.println(s1);}
     //   System.out.println("hello");
    }
    public static int close10(int a, int b) {
        int result = 10;
        int first = Math.abs(a - result);
        int second = Math.abs(b - result);
        if (first < second){
            return a;
        }
        else if ( second < first){
            return b;
        }
        else if ( first == second){
            return first;
        }
        return 0;
    }
    public static String everyNth(String str, int n) {
        String [] s = str.split("");
        String ne ="";
        System.out.println(Arrays.toString(s));
        for (int i =0; i<s.length;i=i+n){

            System.out.println(i);
            ne=ne+s[i];


        }
        return ne;
    }
}
