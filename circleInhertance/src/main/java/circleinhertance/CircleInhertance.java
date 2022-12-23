
package circleinhertance;

import java.util.Scanner;

public class CircleInhertance {

    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      double r,h;
      String color;        
      circle ci = new circle();
      cylinder cy ;
        System.out.print("enter radius of the circle : ");
        r=input.nextDouble();
        ci.setRadius(r);
        System.out.println("area of the circle = " + ci.getArea(r));
        System.out.print("enter color of the circle : ");
        color=input.next();
        ci.setColor(color);
        
        System.out.print("enter hieght of the cylinder : ");
        h=input.nextDouble();
        cy= new cylinder(h,r);
        System.out.println("volume of the cylinder = " + cy.getVolume(h));
        
        System.out.println("******************");
        System.out.println("circle : ");
        System.out.println( ci.toString());
        System.out.println("******************");
        System.out.println("cylinder : ");
        System.out.println(cy.toString());
        
        
        
        
    }
}
