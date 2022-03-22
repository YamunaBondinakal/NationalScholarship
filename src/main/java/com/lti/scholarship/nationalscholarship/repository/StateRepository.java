package com.lti.scholarship.nationalscholarship.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.scholarship.nationalscholarship.entity.StateOfficer;

@Repository
public interface StateRepository extends CrudRepository<StateOfficer, Long> {

}
