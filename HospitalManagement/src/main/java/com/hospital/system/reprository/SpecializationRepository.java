package com.hospital.system.reprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.system.model.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Integer>{

}
