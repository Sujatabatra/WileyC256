package com.sujata.serializationcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



/*
 * Container Class is serialized but has a relationship class is not Serialized
 */
public class SerializationCaseThreeDemo {

	public static void main(String[] args) {
		try(FileOutputStream fileOutputStream=new FileOutputStream("MyEmpDemo");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)){
		
			Address address=new Address(101, "My Street", "My City", "My State", "11111");
			MyEmployee employee=new MyEmployee(101, "AAAA", "Associate", address);
			
			objectOutputStream.writeObject(employee);
			System.out.println("File Created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=======================================");
		
		
		try(FileInputStream fileInputStream=new FileInputStream("MyEmpDemo");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);){
			
			MyEmployee emp=(MyEmployee)objectInputStream.readObject();
			System.out.println("Employee id : "+emp.getEmpId());
			System.out.println("Employee Name : "+emp.getEmpName());
			System.out.println("Employee Designation : "+emp.getDesignation());
			System.out.println("Employee Address : "+emp.getAddress().getHouseNo()+","+emp.getAddress().getStreet()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getState()+" "+emp.getAddress().getPinCode());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

}
