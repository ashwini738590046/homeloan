package com.paskasApp.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paskasApp.model.CibilScore;



@Repository
public interface CibilScoreRepositoryi extends JpaRepository<CibilScore, Integer>
{

}

