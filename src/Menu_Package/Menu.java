package Menu_Package;
import java.util.Date;
import java.util.HashMap;

public class Menu {


    private String restaurantName;
    private HashMap<String, String> hours;
    private String dateLastUpdated;

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public HashMap<String, String> getHours() {
        return hours;
    }

    public void setHours(HashMap<String, String> hours) {
        this.hours = hours;
    }


}


