package com.student;


public class StudentDetails {
	public void createStudentDetails(Student studentone) {
		System.out.println("printstudent:"+studentone);
		}

public static void main(String args[]) {
	Student studentone=new Student();
	Student studenttwo=new Student();
	studentone.setStudentId(12);
	studenttwo.setStudentId(13);
	
	studentone.setFirstName("Bhuvana");
	studenttwo.setFirstName("Kowsi");
	studentone.setLastName("Ramasamy");
	studenttwo.setLastName("Chinraj");
	studentone.setBranch("ECE");
	studenttwo.setBranch("ECE");
	studentone.setGender("Female");
	studenttwo.setGender("Female");
	StudentDetails studentdetails=new StudentDetails(); 
		studentdetails.createStudentDetails(studentone);
		studentdetails.createStudentDetails(studenttwo);
	


	}
}
