package com.malex.perez;

import java.util.Scanner;

public class Assignment_2 {
	
	
	public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter 2 ints:");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			while(y != 0){
				
				int memory = x & y;
				
				x = x ^ y;
				
				y  = memory << 1;
				
			}
			
			System.out.println(x);
			
			scan.close();
			
		}
}
