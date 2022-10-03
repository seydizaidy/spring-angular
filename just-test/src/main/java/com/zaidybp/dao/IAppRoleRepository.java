package com.zaidybp.dao;

import com.zaidybp.entiities.AppRoles;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppRoleRepository  extends JpaRepository<AppRoles,Long> {


}
