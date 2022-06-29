package in.cg.service;


import in.cg.entities.Certificate;
import in.cg.entities.Student;

public interface IStudentService 
{
	public Student addStudent(Student student);
	public Student updateStudent(Student student); 
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int ticketNo); 
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public boolean  deleteStudent(int id);
	
	

}
