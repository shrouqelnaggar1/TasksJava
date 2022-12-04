package com.mycompany.task2;
import java.util.Scanner ;
public class Task2 {
    static int factorial(int n){
        int fact=1;
        int i=1;
        while(i<=n){
            fact*=i;
            i++;
        }
        return fact ; 
    }


    public static void main(String[] args) {
        int n,r , comb,per ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Value of n:");
        n=input.nextInt();
        System.out.println("Enter The Value of r:");
        r=input.nextInt();
        per=factorial(n)/factorial(n-r);
         System.out.println("permutation :" +per);
         comb=factorial(n)/(factorial(r)*factorial(n-r));
         System.out.println("combination :" +comb);
    }
}
