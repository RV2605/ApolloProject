package Mobile;

public class MobileDemo {
   private String MobileBrand = "apple";
   private String MobileModel= "Galaxy note 11";
   private int NoOfQuantity = 2;
   private double Price = 45000.00;
    private double Tax =(getPrice()/13) ;
    private double Discount = 5;

    public MobileDemo(String MobileBrand,String MobileModel,int NoOfQuantity,double Price,double
                      Tax, double Discount){
        this.MobileBrand = MobileBrand;
        this.MobileModel = MobileModel;
        this.NoOfQuantity = NoOfQuantity;
        this.Price = Price;
        this.Tax = Tax;
        this.Discount = Discount;
    }

    public MobileDemo() {
    }

    public String getMobileBrand() {
        return MobileBrand;
    }

    public String getMobileModel() {
        return MobileModel;
    }

    public int getNoOfQuantity() {
        return NoOfQuantity;
    }

    public double getPrice() {
        return Price;
    }

    public double getTax() {
        return Tax;
    }

    public double getDiscount() {
        return Discount;
    }


    public void setDiscount(double discount){
        this.Discount = discount;

    }
}
