package com.lti.scholarship.nationalscholarship.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.scholarship.nationalscholarship.entity.Institute;

@Repository
public interface InstituteRepository extends CrudRepository<Institute, Long> {

}
