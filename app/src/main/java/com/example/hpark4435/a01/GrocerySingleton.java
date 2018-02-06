package com.example.hpark4435.a01;

/**
 * Created by Hpark4435 on 2/6/2018.
 */


// ClassicSingleton class maintains a static reference to the lone singleton instance and returns that reference from the static getInstance() method.
public class GrocerySingleton {
    private static GrocerySingleton ourInstance = null;

    private String customerName;
    private int list_Item;
    private String ItemName;
    private int quantityItem;
    private int year;
    private int month;
    private int day;



    public static GrocerySingleton getInstance() {
        if(ourInstance == null)
        {
            ourInstance = new GrocerySingleton();
        }
        return ourInstance;
    }

    //a private constructor so no instances can be made outside this class
    private GrocerySingleton() {} // By using this, no outer class can initialize this class's object

    public String getCustomername() {return customerName;}
    public String getItemName() {return ItemName;}
    public int getQunatity() {return quantityItem;}




}
