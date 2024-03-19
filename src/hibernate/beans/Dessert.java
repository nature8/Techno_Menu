
package hibernate.beans;

public class Dessert {
    private String dishName;
    private String category;
    private String mainIngredient;
    private int price;

    public Dessert() {
    }

    public Dessert(String dishName, String category, String mainIngredient, int price) {
        this.dishName = dishName;
        this.category = category;
        this.mainIngredient = mainIngredient;
        this.price = price;
    }
    
    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
