package com.mycompany.task7;


public class Task7 {

    public static void main(String[] args) {
        int a[] = { 15, 20, -10, 2, 43, 29 };
        int n = a.length;
        System.out.println("\nBefore sorting array elements are - ");
        QuickF q1 = new QuickF();
        q1.printArr(a, n);
        q1.quick(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        q1.printArr(a, n);
        System.out.println();
    }
}
