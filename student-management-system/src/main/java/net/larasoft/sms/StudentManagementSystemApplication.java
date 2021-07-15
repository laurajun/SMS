package net.larasoft.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.larasoft.sms.entity.Student;
import net.larasoft.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Laura", "Juntunen", "laanirju@gmail.com");
//		studentRepository.save(student1);
//			
//		Student student2 = new Student("Leena", "Lipponen", "leli2@goofymail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Erno", "Elävä", "eelo@goofymail.com");
//		studentRepository.save(student3);
	}
}
