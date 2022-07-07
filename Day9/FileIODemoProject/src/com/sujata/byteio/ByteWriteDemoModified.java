package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteDemoModified {

	public static void main(String[] args) {
		
		//Automatic Resource Deallocation : JDK 1.7
		try(FileOutputStream fileOutputStream=new FileOutputStream("ByteDemo");) {	
			byte arr[]={'S','U','J','A','T','A','\n','D','E','L','H','I'};
			
			fileOutputStream.write(arr);
			System.out.println("File Created");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
