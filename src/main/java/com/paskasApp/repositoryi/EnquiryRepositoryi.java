package com.paskasApp.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paskasApp.model.Enquiry;

@Repository
public interface EnquiryRepositoryi extends JpaRepository<Enquiry, Long> {

}
