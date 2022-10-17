package com.acn.sustainability.hackathon.springboot.hackathonspringboot.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.acn.sustainability.hackathon.springboot.hackathonspringboot.domain.Ods;

@Repository
public interface OdsRepository extends JpaRepository<Ods, Long>, JpaSpecificationExecutor<Ods> {}