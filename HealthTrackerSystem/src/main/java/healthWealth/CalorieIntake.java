package healthWealth;

import java.util.Date;

class CalorieIntake {
    private Date date;
    private String foodItem;
    private double calories;

    public CalorieIntake(Date date, String foodItem, double calories) {
        this.date = date;
        this.foodItem = foodItem;
        this.calories = calories;
    }

    public Date getDate() {
        return date;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public double getCalories() {
        return calories;
    }
}