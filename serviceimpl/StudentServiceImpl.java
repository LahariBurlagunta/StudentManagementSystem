package com.example15.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example15.model.Student;
import com.example15.repository.StudentRepository;
import com.example15.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	  public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	  }
	@Override
	public List<Student> getAllStudents(){
		// ToDO Auto-generated method stub
		return studentRepository.findAll();
		
		}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
	return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
	return  studentRepository.save(student);
	}
	  
	@Override
	public void deleteStudentById(Long id) {
	studentRepository.deleteById(id);

	}
}


