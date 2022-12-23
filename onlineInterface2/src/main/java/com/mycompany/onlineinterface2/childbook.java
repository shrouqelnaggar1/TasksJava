
package com.mycompany.onlineinterface2;


public class childbook extends book {
    double price;
    
    @Override
    public double price(double p)
    {   price=p*0.3;
        return price; }
}
