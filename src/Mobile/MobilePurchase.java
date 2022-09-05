package Mobile;

public class MobilePurchase {
    public static void main(String[] args) {
        MobileDemo mobile = new MobileDemo();
        double tax = mobile.getTax();
        String mobileBrand = mobile.getMobileBrand();
        String mobileModel = mobile.getMobileModel();
        double price = mobile.getPrice();
        double discount = mobile.getDiscount();
        int noOfQuantity = mobile.getNoOfQuantity();
        MobilePurchase mp = new MobilePurchase();
        mp.BillAmount(mobileBrand,mobileModel,tax,price,discount,noOfQuantity);
    }
    public void BillAmount(String mobileBrand,String mobileModel,double tax, double price,double discount, int noOfQuantity){
        MobileDemo mob = new MobileDemo();

        if (mobileBrand.toUpperCase().equals("SAMSUNG")){
            System.out.println("Overall Discount is " +discount);
            mob.setDiscount(9);
            System.out.println("Brand specific Discount is " + mob.getDiscount());
            double total = noOfQuantity*((price+tax)-(price/mob.getDiscount()));
            System.out.println("Mobile Brand ------------->" + mobileBrand);
            System.out.println("Model--------------------->" + mobileModel);
            System.out.println("Price--------------------->" + price);
            System.out.println("Tax----------------------->" + tax);
            System.out.println("Discount------------------>" + mob.getDiscount());
            System.out.println("Grand Total--------------->" + total);
        }
        else {
            System.out.println("Overall Discount is " + discount);
            double total = noOfQuantity*((price+tax)-(price/discount));
            System.out.println("Mobile Brand ------------->" + mobileBrand);
            System.out.println("Model--------------------->" + mobileModel);
            System.out.println("Price--------------------->" + price);
            System.out.println("Tax----------------------->" + tax);
            System.out.println("Discount------------------>" + mob.getDiscount());
            System.out.println("Grand Total--------------->" + total);

        }
    }
}
