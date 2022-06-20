package in.cg.client;

import in.cg.entities.Student;
import in.cg.service.StudentService;
import in.cg.service.StudentServiceImpl;

public class Client {
public static void main(String[] args) {
				StudentService obj=new StudentServiceImpl();
				Student student=new Student();
				
				//create 
				/*student.setStudentId(105);
				student.setName("Shagufta");
				obj.addStudent(student);*/
				
				/*//retrieve
				student=obj.findStudentById(101);
				System.out.println("Student Id: "+student.getStudentId());
				System.out.println("Student Name: "+student.getName());*/
				
				//update
				/*student=obj.findStudentById(105);
				student.setName("Netrangi");
				obj.updateStudent(student);*/
				
				//delete
				student=obj.findStudentById(104);
				obj.removeStudent(student);

			}

		
	

	}

