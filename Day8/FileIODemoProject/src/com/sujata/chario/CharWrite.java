package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {

	public static void main(String[] args) {
		try(FileWriter fileWriter=new FileWriter("CharDemo");){
			
			String str="Sujata Batra\nDelhi";
			fileWriter.write(str);
			System.out.println("File Created");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
