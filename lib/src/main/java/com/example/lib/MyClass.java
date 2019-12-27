package com.example.basichw17;


import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int A = scanner.nextInt();
        System.out.println("Enter the second number");
        int B = scanner.nextInt();
        System.out.println("Enter the third number");
        int C = scanner.nextInt();
        System.out.println("Enter the fourth number");
        int D = scanner.nextInt();
        System.out.println("Enter the fifth number");
        int E = scanner.nextInt();
        int arr[]={A,B,C,D,E};
        int MIN=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]<MIN){
                MIN=arr[i];
            }
        }
        System.out.print("The minimum number is "+MIN);


    }

}