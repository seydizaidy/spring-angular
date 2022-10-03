package com.zaidy.services;

import com.zaidy.entities.Student;
import com.zaidy.exceptions.StudentNotFound;

import java.util.List;

public interface ScholarShipService
{
    Student saveStudent(Student student);
    Student getStudent(Long id) throws StudentNotFound;
    List<Student> getAllStudents();
    Student updateStudent(Student student ,Long id) ;// revoir youssoufi
    void deleteStudent(Long id) throws StudentNotFound;

    List<Student> getStudentByKeyword(String keyword);
}
