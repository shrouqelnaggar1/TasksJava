
package onlineshop;


public class childrenbook extends book {
   double price;
    
    @Override
    public double price(double p)
    {   price=p*0.3;
        return price; }
    
}
