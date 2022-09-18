package Interface;

public class DriverCode extends AtchayamRestrauant {
    public static void main(String[] args) {
        FrontInterface fi = new AtchayamRestrauant();
        fi.dailyMenus();
        fi.newItems();
        fi.weekendSpecial();
        AtchayamRestrauant ar = new AtchayamRestrauant();
        ar.billAmount(10,2);
    }
}
