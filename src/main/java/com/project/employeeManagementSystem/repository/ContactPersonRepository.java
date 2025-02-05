package com.project.employeeManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employeeManagementSystem.model.ContactPerson;
import com.project.employeeManagementSystem.model.EmployeeBasicDetails;

/*
 * ContactPersonRepository extends the JpaRepository which contains all the basic CRUD operations in Contact Person Information module
 * @author Liya Mathew
 * @since 09/10/2021
 */

@Repository
public interface ContactPersonRepository extends JpaRepository<ContactPerson, Integer> {
	
	Optional<ContactPerson> findByemployeeIdNumber(int employee_id_number);

	void deleteByemployeeIdNumber(int employee_id_number);
}
