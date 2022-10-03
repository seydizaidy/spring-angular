package com.zaidy;

import com.zaidy.entities.Student;
import com.zaidy.entities.Subscribtion;
import com.zaidy.repositories.StudentRepository;
import com.zaidy.repositories.SubscribtionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class UiCrudSpringAngApplication implements CommandLineRunner {

    private final RepositoryRestConfiguration repositoryRestConfiguration;

    public UiCrudSpringAngApplication(RepositoryRestConfiguration repositoryRestConfiguration) {
        this.repositoryRestConfiguration = repositoryRestConfiguration;
    }

    public static void main(String[] args) {
        SpringApplication.run(UiCrudSpringAngApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubscribtionRepository subscribtionRepository;

    @Override
    public void run(String... args) throws Exception
    {
        repositoryRestConfiguration.exposeIdsFor(Subscribtion.class,Student.class);
        Stream.of("bouba","oumar","ibou ly").forEach
                (
              student  ->
        {
            Student toSaveStudent =new Student();
            toSaveStudent.setName(student);
            toSaveStudent.setEmail("seydi@gmail.com");
            toSaveStudent.setPhoto("photo.png");
            studentRepository.save(toSaveStudent);
        }
        );

        studentRepository.findAll().forEach(student ->
        {
            for (int i=0; i<5 ;i++)
            {
                Subscribtion subscribtion =new Subscribtion();
                subscribtion.setName("course: "+i);
                subscribtion.setDateCourse(new Date());
                subscribtion.setStudent(student);
                    subscribtionRepository.save(subscribtion);

            }
        });

    }
}
