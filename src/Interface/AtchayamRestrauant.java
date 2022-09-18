package Interface;

public class AtchayamRestrauant implements FrontInterface {
    private int price;
    public static final String name ="South-Indian";
    private int total;
    private int quantity;
    private String dishName;

    public AtchayamRestrauant(int price,int total,int quantity,String dishName){

        this.price = price;
        this.total = total;
        this.quantity = quantity;
        this.dishName = dishName;

    }

    public AtchayamRestrauant(){}


    @Override
    public void dailyMenus() {
        System.out.println("Daily menu will be added after 10 AM");
    }

    @Override
    public void newItems() {
        System.out.println("New items to be added");
    }

    @Override
    public void weekendSpecial() {
        System.out.println("Only added on weekend");
    }
    public void billAmount(int price,int quantity){
        total = price*quantity;
        System.out.println("Bill Amount is " + total);
    }

}
