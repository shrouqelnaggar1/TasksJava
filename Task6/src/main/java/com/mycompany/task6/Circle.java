
package com.mycompany.task6;

public class Circle {
    // Java Method to Find the Area of a Circle Given the Radius

    public void area(double r) {
        if (r <= 0) {
            System.out.println("Radius must be positive");
        }
        final double PI = Math.PI;
        double area = PI * Math.pow(r, 2);
        System.out.println("the area of circle is : " + area);
    }

    // Java Method to Find the Perimeter of a Circle Given the Radius

    public void perimeter(double r) {
        if (r <= 0) {
            System.out.println("Radius must be positive");
        }
        final double PI = Math.PI;
        double Perimeter = 2 * PI * r;
        System.out.println("the perimeter of circle is : " + Perimeter);
    }

}

