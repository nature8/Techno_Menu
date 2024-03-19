package hibernate.beans;

public class Drinks {
    private String category;
    private String dishName;
    private String mainIngredient;
    private int price;   
    public Drinks(){
    }
    public Drinks(String category, String dishName, String mainIngredients, int price) 
    {
        this.category = category;
        this.dishName = dishName;
        this.mainIngredient = mainIngredients;
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
