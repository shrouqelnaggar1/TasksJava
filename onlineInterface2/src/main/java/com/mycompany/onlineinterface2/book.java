
package com.mycompany.onlineinterface2;


public class book implements product {
 double price;
    @Override
    public double price(double p) {
       price=p;
       return price;
    }
    
}
