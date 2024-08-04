/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagaicha;

/**
 *
 * @author HP
 */

public class ProductDetails {
    int Product_id;
    String Product_name;
    int Quantity;
    double Price;
    
    ProductDetails(int Product_id, String Product_name, int Quantity, double Price){
        this.Product_name=Product_name;
        this.Quantity=Quantity;
        this.Price=Price;
        
    }
    
    public String getProduct_name(){
    return Product_name;
    }
    public void setProduct_name(String Product_name){
        this.Product_name=Product_name;
    }
    
    public int getQuantity(){
        return Quantity;
    }
    public void setQuantity(int Quantity){
        this.Quantity=Quantity;
    }
    public double getPrice(){
        return Price;
    }
    public void setPrice(double Price){
        this.Price=Price;
    }
    public int getProduct_id(){
        return Product_id;
    }
    public void setProduct_id(int Product_id){
        this.Product_id=Product_id;
    }
}

