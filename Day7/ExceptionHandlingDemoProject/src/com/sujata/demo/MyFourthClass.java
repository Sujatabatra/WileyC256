package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFourthClass {

	public static void openFile(String fileName)throws FileNotFoundException {
		FileInputStream fileInputStream=new FileInputStream(fileName);
		System.out.println("File "+fileName+" opened!");

	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String fileName=scanner.next();
		try {
			openFile(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("File with name "+fileName+" doesnot exist!");
		}

	}

}
