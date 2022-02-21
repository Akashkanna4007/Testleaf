package org.student;

import org.department.Department;

public class Student extends Department  {
	public void studentName(){
		System.out.println("Akashkanna");
	}
	public void studentDept() {
		System.out.println("Mechanical");
	}
	public void studentId( ) {
		System.out.println("4007");
	}

	public static void main(String[] args) {
		Student fin = new Student();
		
		fin.collegeCode();
		fin.collegeName();
		fin.collegeRank();
		fin.collegeRank();
		fin.department();
		fin.studentDept();
		fin.studentId();
		fin.studentId();
		fin.studentName();
		
		

	}

}
