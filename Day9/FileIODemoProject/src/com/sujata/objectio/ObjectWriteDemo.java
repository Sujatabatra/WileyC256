package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteDemo {
	
	public static void main(String args[]) {
		try (FileOutputStream fileOutputStream=new FileOutputStream("ObjectDemo");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);){
			Person person=new Person(101,"AAAAA");
			
			objectOutputStream.writeObject(person);
			System.out.println("File created");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
