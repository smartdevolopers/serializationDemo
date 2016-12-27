package com.kdk.domain;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId("11");
		e1.setName("Nani");
		e1.setPhoneNo("111-111-1111");
		
		Employee e2 = new Employee();
		e2.setId("12");
		e2.setName("Danny");
		e2.setPhoneNo("222-222-2222");
		
		
		try{
			FileOutputStream fo = new FileOutputStream("emp.ser");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(e1);
			oo.writeObject(e2);
			oo.close();
			fo.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
