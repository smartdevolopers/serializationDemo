package com.kdk.domain;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeSerialization {

	public static void main(String[] args) {
		try{
			FileInputStream fi = new FileInputStream("emp.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Employee e1 = (Employee)oi.readObject();
			System.out.println(e1.getId()+" "+e1.getName()+" "+ e1.getPhoneNo());
			
			Employee e2 = (Employee)oi.readObject();
			System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getPhoneNo());
			
			oi.close();
			fi.close(); 
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
