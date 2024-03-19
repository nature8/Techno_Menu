
package hibernate.beans;

public class MainCourse {
    private String category;
    private String dishName;
    private String mainIngredient;
    private int price;   
    public MainCourse(){
    }
    public MainCourse(String category, String dishName, String mainIngredient, int price) {
        this.category = category;
        this.dishName = dishName;
        this.mainIngredient = mainIngredient;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
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
