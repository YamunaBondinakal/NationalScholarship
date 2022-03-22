package com.lti.scholarship.nationalscholarship.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.scholarship.nationalscholarship.entity.MinistryOfficer;

@Repository
public interface MinistryRepository extends CrudRepository<MinistryOfficer, Long> {

}
