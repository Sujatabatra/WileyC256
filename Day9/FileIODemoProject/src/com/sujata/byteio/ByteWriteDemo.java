package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteDemo {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream=null;
		try {
			fileOutputStream=new FileOutputStream("ByteDemo");
			byte arr[]={'S','U','J','A','T','A','\n','D','E','L','H','I'};
			
			fileOutputStream.write(arr);
			System.out.println("File Created");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
