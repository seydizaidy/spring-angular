package com.zaidy.repositories;

import com.zaidy.entities.Subscribtion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface SubscribtionRepository  extends JpaRepository<Subscribtion,Long>
{
}
