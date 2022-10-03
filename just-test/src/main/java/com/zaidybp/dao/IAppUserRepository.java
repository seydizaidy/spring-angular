package com.zaidybp.dao;

import com.zaidybp.entiities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<AppUser,Long>
{
    AppUser findByEmail(String email);
    AppUser findByNom(String email);
}
