package com.main;

public class PatternS {
	
	public static void main(String[] args) {
		//pattern1(5);
		pattern2(4);
	}
	
	static void pattern1(int n) {
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 4;j>=i;j--) {
				
				System.out.print(" ");
			}
			for(int k = 1;k<=i; k++) {
				
				System.out.print("*");
			}
			for(int l = 2;l>=i; l++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}
	
	static void pattern2(int n) {
		
		
		for(int i = 1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//Pankaj raut
	}
}
