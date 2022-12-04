package com.mycompany.task4;
import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        //Scanner class to take input
        Scanner scan = new Scanner(System.in);

        // Initializing the 2X2 matrix i.e. 2D array
        int arr[][] = new int[2][2], res[][] = new int[2][2];
        int row, col ;
        
        // Taking matrix input
        System.out.println("\nEnter matrix elements : ");
        for(row=0;row<2;row++)
            for(col=0;col<2;col++)
                arr[row][col] = scan.nextInt();
        
        //System.out.print("The matrix elements are : ");
        //printMatrix(arr);

        // Loops to find transpose of the matrix
        for(row=0;row<2;row++)
            for(col=0;col<2;col++)
            {   
                res[col][row]= arr[row][col];
            }   
        System.out.print("\n\nThe transpose of the matrix : ");
       printMatrix(res);
    }

    // Function to print the matrix
    static void printMatrix(int arr[][])
    {
        int row, col;
        // Loop to print the elements
        for(row=0;row<2;row++)
        {
            // Used for formatting
            System.out.print("\n");
            for(col=0;col<2;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
        }
    }
        
       
 }
