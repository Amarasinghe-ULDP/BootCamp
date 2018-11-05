package com1.danushka;

public class Appication {
	
	public static void main(String args[]){
		
		Student student = new Student();
		Course course = new Course();
		
		course.setCourseName("Jave");
		student.setName("Saman");
		student.setId(10);
		student.setMark(75);
		student.setCourse(course);
		
		System.out.println(student.getName() + "[" + student.getId() + "-" + student.getMark() + "]" + "study");
		
		changeCourse2(student);
		
		System.out.println(student.getName() + "[" + student.getId() + "-" + student.getMark() + "]" + "study");
	}
	
	public static void changeCourse2(Student s){
		
		Course course = new Course();
		course.setCourseName("Microservices");
		s.setName("Saman Perere");
		s.setId(12);
		s.setMark(90);
		s.setCourse(course);
		
		
	}

}
