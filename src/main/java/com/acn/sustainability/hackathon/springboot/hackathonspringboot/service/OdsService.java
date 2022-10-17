package com.acn.sustainability.hackathon.springboot.hackathonspringboot.service;


import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acn.sustainability.hackathon.springboot.hackathonspringboot.domain.Ods;
import com.acn.sustainability.hackathon.springboot.hackathonspringboot.repository.OdsRepository;

@Service
@Transactional
public class OdsService {

    private final Logger log = LoggerFactory.getLogger(OdsService.class);

    private final OdsRepository odsRepository;

    public OdsService(OdsRepository odsRepository) {
        this.odsRepository = odsRepository;
    }

    public Ods save(Ods ods) {
        log.debug("Request to save Ods : {}", ods);
        return odsRepository.save(ods);
    }

    public Optional<Ods> partialUpdate(Ods ods) {
        log.debug("Request to partially update Ods : {}", ods);

        return odsRepository
            .findById(ods.getId())
            .map(
                existingOds -> {
                    if (ods.getDescricao() != null) {
                        existingOds.setDescricao(ods.getDescricao());
                    }

                    return existingOds;
                }
            )
            .map(odsRepository::save);
    }

    @Transactional(readOnly = true)
    public Page<Ods> findAll(Pageable pageable) {
        log.debug("Request to get all Ods");
        return odsRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Optional<Ods> findOne(Long id) {
        log.debug("Request to get Ods : {}", id);
        return odsRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Ods : {}", id);
        odsRepository.deleteById(id);
    }
}