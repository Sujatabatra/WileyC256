package com.sujata.serializabledemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) {
		try(FileInputStream fileInputStream=new FileInputStream("PersonDemoFile");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);){
			
			Person person=(Person)objectInputStream.readObject();
			System.out.println(person.getPersonId()+"   "+person.getPersonName()+"   "+person.getPersonAge()+"  "+person.getPersonGender());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
