package Menu_Package;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private String[] categories = {"Appetizer", "Main course", "Dessert"};
    private boolean newItem;

    public MenuItem(double price, String description, String category, boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }
}
