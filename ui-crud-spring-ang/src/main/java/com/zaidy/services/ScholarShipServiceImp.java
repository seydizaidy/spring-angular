package com.zaidy.services;

import com.zaidy.entities.Student;
import com.zaidy.exceptions.StudentNotFound;
import com.zaidy.repositories.StudentRepository;
import com.zaidy.repositories.SubscribtionRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service

public class ScholarShipServiceImp implements  ScholarShipService
{
    private StudentRepository studentRepository;
    private SubscribtionRepository subscribtionRepository;

    public ScholarShipServiceImp(StudentRepository studentRepository,
                                 SubscribtionRepository subscribtionRepository) {
        this.studentRepository = studentRepository;
        this.subscribtionRepository = subscribtionRepository;
    }

    @Override
    public Student saveStudent(Student student)
    {
        Student student1 =studentRepository.save(student);
        return student1;

    }

    @Override
    public Student getStudent(Long id) throws StudentNotFound {
       Student student= studentRepository.findById(id).orElseThrow(()->new StudentNotFound("Student Not Found"));

       return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) throws StudentNotFound {
        Student student= getStudent(id);
        studentRepository.delete(student);
        studentRepository.deleteById(id);

    }
    @Override
    public  List<Student> getStudentByKeyword(String keyword){
        return studentRepository.searchByKeyword(keyword);
    }
}
