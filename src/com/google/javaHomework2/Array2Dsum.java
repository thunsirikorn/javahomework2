package com.google.javaHomework2;

public class Array2Dsum {
	public static void main(String[] args) {
		
		int myArray[][] = {{1,1},{2,1},{3,1},{1,2},{2,2},{3,2},{1,3},{2,3},{3,3},{1,4},{2,4},{3,4}};
		int mySum = 0;
		
			
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[i].length; j++) {
				mySum += myArray[i][j];
			}
		
				System.out.println(mySum);
				mySum = 0;
		}
	}
}
