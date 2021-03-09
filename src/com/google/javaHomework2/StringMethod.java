package com.google.javaHomework2;

public class StringMethod {
	public static void main(String[] args) {
		String myString1 = "You and Me";
		String myString2 = " you and me ";
		
		if(myString1.equals(myString2)) {
			System.out.println("String equal");
		} else { 
			System.out.println("String not equal");
		}
		
		//ค้นหาคำใน string
		System.out.println("ค้นหาคำ string1 : " + myString1.contains("Me"));
		System.out.println("ค้นหาคำ string2 : " + myString2.contains("You"));
		
		//ความยาวของ string
		System.out.println("ความยาวคำ string1 : " + myString1.length());
		System.out.println("ความยาวคำ string2 : " + myString2.length());
		
		//ต้ดข้อความ
		System.out.println("ต้ดข้อความ string1 : " + myString1.substring(4));
		System.out.println("ต้ดข้อความ string2 : " + myString2.substring(4));
		
		//ต้ดช่องว่างของประโยค
		System.out.println("ต้ดช่องว่างของประโยค string1 : " + myString1.trim());
		System.out.println("ต้ดช่องว่างของประโยค string2 : " + myString2.trim());
		
		//เปลี่ยน string เป็นตัวพิมพ์ใหญ่ทั้งหมด
		System.out.println("ตัวพิมพ์ใหญ่ string1 : " + myString1.toUpperCase());
		System.out.println("ตัวพิมพ์ใหญ่ string2 : " + myString2.toUpperCase());
		
		//เปลี่ยน string เป็นตัวพิมพ์ใหญ่ทั้งหมด และไม่มีช่องว่างซ้ายขวา
				System.out.println("ตัวพิมพ์ใหญ่ไม่มีช่องว่าง string1 : " + myString1.toUpperCase().trim());
				System.out.println("ตัวพิมพ์ใหญ่ไม่มีช่องว่าง string2 : " + myString2.toUpperCase().trim());
	}
}
