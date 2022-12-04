package com.mycompany.task5;
import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        String text ;
        //Scanner class to take input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Text with comma(,): ");
        text= input.nextLine();
        text=text.replaceAll(",","");
         System.out.println("The Text After Replacing: "+text);
    }
}
