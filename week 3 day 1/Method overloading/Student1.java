package org.system;

public class Student1 {
	public void getStudentInfo(int id) {
		System.out.println("The Student Id is"+" "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("The Student Id is"+" "+id);
		System.out.println("The Student name is"+" "+name);
	}
	public void getstudentInfo(String email, long phoneNumber) {
		System.out.println("E-mail id is"+" "+email);
		System.out.println("Phone number is"+" "+phoneNumber);
	}
	public static void main(String[] args) {
		Student1 info = new Student1();
		info.getStudentInfo(4007);
		info.getStudentInfo(4007, "Akash");
		info.getstudentInfo("akashkannamech@gamail.com", 869518216);
			
		
	}
		
}

	

