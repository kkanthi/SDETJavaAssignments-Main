package assignment2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
        System.out.print("Enter a number - ");
        int num = scan.nextInt(); 
        int sum = 0;
        while(num != 0) {
        	sum = sum + num % 10;
        	num = num / 10;
        }
        System.out.print("Sum of digits - "+ sum);

	}


}


