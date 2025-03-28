package com.zky.springboot.mydemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.zky.springboot.mydemo.dao.StudentDAO;
import com.zky.springboot.mydemo.entity.Student;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
// @SpringBootApplication
public class MydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			// createStudent(studentDAO);
			// readStudent(studentDAO);
			// queryForStudents(studentDAO);
			// updateStudent(studentDAO);
			// deleteStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		Student tempStudent = new Student("Paul", "Doe", "paul@zky.com");
		studentDAO.save(tempStudent);

		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}

	private void readStudent(StudentDAO studentDAO) {
		Student tempStudent = new Student("Daffy", "Duck", "daffy@zky.com");
		studentDAO.save(tempStudent);

		System.out.println("Saved student. Generated id: " + tempStudent.getId());

		Student student = studentDAO.findById(tempStudent.getId());
		System.out.println("Found the student: " + student);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student student = studentDAO.findById(1);
		student.setLastName("Smiht");
		studentDAO.update(student);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		studentDAO.delete(3);
	}
}
