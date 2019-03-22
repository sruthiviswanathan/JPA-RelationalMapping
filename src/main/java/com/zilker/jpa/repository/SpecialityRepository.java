package com.zilker.jpa.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zilker.jpa.beans.Speciality;

public interface SpecialityRepository extends JpaRepository<Speciality, Integer> {

	 @Query("SELECT d FROM Speciality d WHERE d.name = ?1")
	    Speciality findByName(@Param("name") Set<Speciality> name);
	
}
