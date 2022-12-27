package practice_question;

import java.util.Scanner;

public class Q4 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		
		// inverted pyramid rotated by 180 degree
		
		System.out.println("Set rows:");
		int rows = sc.nextInt();
		// outer loop
		for(int i=1;i<=rows;i++) {
			
			// inner loop -> for space print
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
