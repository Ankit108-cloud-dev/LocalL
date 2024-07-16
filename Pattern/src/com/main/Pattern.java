package com.main;

public class Pattern {
	
	public static void main(String[] args) {
		
//		pattern1(4);
//		pattern2(6);
//		pattern3(2);
//		pattern4(5);
//		pattern5(4);
//		pattern6(4);
		//pattern7(6);
		pattern8(4);
		
	}
	
	
	static void pattern1(int n){
		
		
		for(int i = 1;i<= n;i++) {
			
			for(int j = 1;j<=(n+1-i);j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
static void pattern7(int n){
		
		
		for(int i = 1;i<= n;i++) {
			
			for(int j = n;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<=i; k++) {
				System.out.print("* ");
			}
			for(int l = 2;l<=i; l++) {
				System.out.print("^ ");
			}
			
			
			System.out.println();
		}
		
	}
	
static void pattern6(int n){
		
		
		for(int row = 1;row<2 * n;row++) {
			
			int NoOfColInRow = row > n ? 2 * n - row : row;
			for(int col = 1;col<=NoOfColInRow;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
static void pattern5(int n){
		
		
		for(int i = 1;i<= n;i++) {
			
			for(int j = 1;j<=n;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
static void pattern4(int n){
		
		
		for(int i = 1;i<= n;i++) {
			
			for(int j = 1;j <= i;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
}
static void pattern2(int n){
		
		
		for(int i = 1;i<= n;i++) {
			
			for(int j = 1;j<=(n+1-i);j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

static void pattern3(int n){
	
	
	for(int i = 1;i<= n;i++) {
		
		for(int j = 1;j<=(n+1-i);j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
	
}
static void pattern8(int n) {
	
	for(int row = 1;row <= n; row++) {
		for(int col=1; col<=row; col++) {
			
			System.out.print();
			
		}
		System.out.println("");
	}
}
}
