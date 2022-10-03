package com.zaidy.controllers;

import com.zaidy.entities.Student;
import com.zaidy.exceptions.StudentNotFound;
import com.zaidy.repositories.StudentRepository;
import com.zaidy.services.ScholarShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Generated;
import java.util.List;

@CrossOrigin("*")
@RestController
public class StudutentApi
{
   @Autowired
    private StudentRepository studentRepository;

    private ScholarShipService scholarShipService;

    public StudutentApi(ScholarShipService scholarShipService)
    {
        this.scholarShipService = scholarShipService;
    }

    @PostMapping("/api/students")
    public Student saveStudent(@RequestBody Student student)
    {

        return scholarShipService.saveStudent(student);
    }
    @GetMapping("/api/students")
    public List<Student> listOfStudents()
    {
        return  scholarShipService.getAllStudents();
    }
    @GetMapping("/api/students/{id}")
    public Student  getStudentById(@PathVariable("id") Long id) throws StudentNotFound
    {
        return scholarShipService.getStudent(id);
    }
    @DeleteMapping("/api/students/{id}")
    public void deleteStudent(@PathVariable("id") Long id) throws StudentNotFound
    {
        studentRepository.deleteById(id);
       // scholarShipService.deleteStudent(id);
    }
    @GetMapping("/api/students/search")
    public  List<Student> GetStudentsByKeyword(@RequestParam(name = "keyword",defaultValue = "")String keyword)
    {
      return    scholarShipService.getStudentByKeyword("%"+keyword+"%");
    }
    @PutMapping("/api/students/{id}")
    public  Student updateStudent(@PathVariable("id") Long id,@RequestBody Student student) throws StudentNotFound {
        student.setIdCart(id);
        //Ancienne Methode
//        Student student1=scholarShipService.getStudent(id);
//        student1.setEmail(student.getEmail());

        return scholarShipService.saveStudent(student);
    }
    //Autre Methode pour update
    @PostMapping("/api/{id}")
    public Student tryOtherMethodeForUpdate(@PathVariable("id") Long id,@RequestBody Student student) throws StudentNotFound
    {
        Student student1=scholarShipService.getStudent(id);
        student1.setEmail(student.getEmail());
        student1.setPhoto(student.getPhoto());
        student1.setName(student.getName());

        return studentRepository.save(student1);

    }
}
