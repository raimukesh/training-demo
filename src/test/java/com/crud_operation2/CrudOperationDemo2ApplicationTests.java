package com.crud_operation2;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud_operation2.entities.Student;
import com.crud_operation2.repositories.StudentRepository;

@SpringBootTest
class CrudOperationDemo2ApplicationTests {
	
	@Autowired
	StudentRepository studentRepo;

//	@Test
//	void createStudentRecord() {
//		Student s = new Student();
//		s.setSname("gaurav");
//		s.setScourse("python");
//		s.setSfee(10000);
//		studentRepo.save(s);
//	}
	
//	@Test
//	void deleteStudentRecord() {
//		
//		studentRepo.deleteById(13L);
//	}
	
//	@Test
//	void showStudentRecord() {
//		Optional<Student> findById = studentRepo.findById(14L);
//		Student student = findById.get();
//		System.out.println(student.getId());
//		System.out.println(student.getSname());
//		System.out.println(student.getScourse());
//		System.out.println(student.getSfee());
//		
//	}
	
	@Test
	void updateStudentRecord() {
		Optional<Student> findById = studentRepo.findById(14L);
		Student student = findById.get();
		student.setScourse("testing");
		student.setSfee(3000);
		studentRepo.save(student);
	}

}
