/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ritesh.crm;

/**
 *
 * @author Trainee
 */
public class Order {
    String product_name=null;
    String product_id=null;
    double price=0.0;
    int quantity=0;
    double gross_price=0.0;
    public Order(String product_name,String product_id,double price,int quantity,double gross_price){
        this.product_id=product_id;
        this.product_name=product_name;
        this.quantity=quantity;
        this.price=price;
        this.gross_price=gross_price;
    }
    public String getName(){
        return product_name;
    }
    public String getId(){
        return product_id;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
