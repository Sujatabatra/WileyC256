package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyThirdClass {

	public static void openFile(String fileName) {
		try {
		FileInputStream fileInputStream=new FileInputStream(fileName);
		System.out.println("File "+fileName+" opened!");
		}
		catch(FileNotFoundException fileNotFoundException) {
			System.out.println("File with name "+fileName+" doesnot exist!");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String fileName=scanner.next();
		openFile(fileName);

	}

}
