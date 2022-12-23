
package com.mycompany.onlineinterface2;

public class cartoonbook extends childbook {
    double price;
    
    @Override
    public double price(double p)
    {   price=p*0.5;
        return price; }
}
