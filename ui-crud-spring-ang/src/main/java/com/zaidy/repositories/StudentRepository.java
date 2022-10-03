package com.zaidy.repositories;

import com.zaidy.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface StudentRepository extends JpaRepository<Student,Long>
{
    @Query("select s from Student s where s.name like :kw")
    List<Student> searchByKeyword(@Param("kw") String WordToSearch);
    List<Student> findByNameContaining(String name);
}
