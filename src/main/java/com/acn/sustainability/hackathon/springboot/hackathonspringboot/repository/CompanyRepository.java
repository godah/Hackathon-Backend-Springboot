package com.acn.sustainability.hackathon.springboot.hackathonspringboot.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.acn.sustainability.hackathon.springboot.hackathonspringboot.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>, JpaSpecificationExecutor<Company> {}