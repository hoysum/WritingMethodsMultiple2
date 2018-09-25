package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number");
        int yourInput = keyboard.nextInt();
        int result = multiplyBy2(yourInput); //call multiple by 2 method
        System.out.println("Your result after muliplying by 2 is " + result);
        //print out result
    }

    public static int multiplyBy2(int yourInput) {
        int result = yourInput * 2;
        return result;

    }

}
