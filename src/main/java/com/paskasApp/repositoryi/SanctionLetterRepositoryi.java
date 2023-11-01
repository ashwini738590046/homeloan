package com.paskasApp.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paskasApp.model.SanctionLetter;

@Repository

public interface SanctionLetterRepositoryi extends JpaRepository<SanctionLetter,Long> {



}
