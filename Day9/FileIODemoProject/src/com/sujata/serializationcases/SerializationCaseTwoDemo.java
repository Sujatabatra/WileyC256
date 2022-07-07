package com.sujata.serializationcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



/*
 * Base class is not serialized but derived class is Serialized
 */
public class SerializationCaseTwoDemo {

	public static void main(String[] args) {
		try(FileOutputStream fileOutputStream=new FileOutputStream("EmpDemo");
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)){
		
			SerializedEmployee employee=new SerializedEmployee(101, "AAAA", "IT", "Associate", 25000);
			
			objectOutputStream.writeObject(employee);
			System.out.println("File Created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=======================================");
		
		
		try(FileInputStream fileInputStream=new FileInputStream("EmpDemo");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);){
			
			SerializedEmployee emp=(SerializedEmployee)objectInputStream.readObject();
			System.out.println("Employee id : "+emp.getPersonId());
			System.out.println("Employee Name : "+emp.getPersonName());
			System.out.println("Employee Designation : "+emp.getDesignation());
			System.out.println("Employee Department : "+emp.getDepartment());
			System.out.println("Employee Salary : "+emp.getSalary());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

}
