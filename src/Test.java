public class Test {
    public static void main(String[] args) {
        Test st = new Test();
      //  System.out.println(st.attendence(11));
       // System.out.println(st.computer("not"));
        //System.out.println(st.calender(4));
        System.out.println("the largest number is "+largest(8,245,10));

    }

    public String computer(String c){
        int d = c.length();
        if( d >=3) {
            String a = c.substring(0, 3);
            System.out.println(a);
            if (a.equals("not")){
                return c;
            }
            else{
                c="not "+c;
                return c;
            }
        }


       return c;
    }
    public String attendence(int time){
        if( time <= 10){
            String entry = "Please enter the class";
            return entry;
        }
        else{
            String exit = "get out of the class";
            return exit;
        }

    }
    public String calender(int month){
        int odd = month % 2;
        if ( month <=12) {
            if ((odd != 0 && month <= 7) || (odd ==0 && month >=8)){
                String out = "the month has 31 days ";
                return out;
            } else if (odd ==0 && month ==2) {
                String out = "Its February check for the leap year";
                return out;

            } else{
                String out ="the month has 30 days";
                return out;
            }
        }
        else{
            return "enter the proper month number";
        }
    }

    public static int largest(int first,int second, int third){
        if( first > second & first > third) {
            return first;
        }
        else if( second > first & second > third) {
            return second;
        }
        else{
            return third;
        }


    }
}

