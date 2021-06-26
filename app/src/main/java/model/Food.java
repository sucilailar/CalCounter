package model;

import java.io.Serializable;

public class Food implements Serializable {
    private static final long serialVersionID = 10L;
    private String foodName;
    private int calories;
    private int foodId;
    private String recordDate;

    public Food (String food, int cals, int id, String date){
        foodName = food;
        calories = cals;
        foodId = id;
        recordDate = date;
    }

    public Food(){

    }

    public static long getSerialVersionID() {
        return serialVersionID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodIdl) {
        this.foodId = foodIdl;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordData) {
        this.recordDate = recordData;
    }
}
