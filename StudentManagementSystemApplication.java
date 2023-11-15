package com.example15;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example15.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

    StudentManagementSystemApplication(StudentRepository studentRepository) {
    }

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
 @Override
	public void run(String... args) throws Exception {
	 /*
      *	 Student student1=new Student("navaneeth","navaneeth@gmail.com","9098780987)");
	  *  studentRepository.save(student1);
	  *  Student studnet2=new Student("benny","benny@gmail.com","9876544321");
	  *  studentRepository.save(student2);
	  *  Student studnet3=new Student("Arjun","Arjun@gmail.com","9876544321");
	  *  studentRepository.save(student3);
		
	*/
		
	}

}