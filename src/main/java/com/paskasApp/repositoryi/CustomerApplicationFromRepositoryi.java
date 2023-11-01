package com.paskasApp.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paskasApp.model.CustomerApplicationFrom;

@Repository
public interface CustomerApplicationFromRepositoryi extends JpaRepository<CustomerApplicationFrom, Long>{

}
