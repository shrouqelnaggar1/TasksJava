
package onlineshop;


public class book extends product {
   double price;
    
    @Override
    public double price(double p)
    {   price=p*0.5;
        return price; }
}
