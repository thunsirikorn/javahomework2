package com.google.javaHomework2;

public class Array2D {
	public static void main(String[] args) {
		int[][] twoD_Array = {
				{1,2,3},{4,5,6,7},{8,9}		
		};
		
		for (int row = 0; row < twoD_Array.length; row++) {
			for (int element = 0; element < twoD_Array[row].length; element++) {
				System.out.println(twoD_Array[row][element]);
			}
		}
		
		for (int[] row: twoD_Array) {
			for (int element: row) {
				System.out.println(element);
			}
		}
	}
}
