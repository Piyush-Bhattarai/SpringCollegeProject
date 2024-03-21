package com.hospital.system.service;

import java.util.List;

import com.hospital.system.model.Specialization;

public interface SpecializationService {
	
	public void addspecialization(Specialization specialization);
	
	void deleteSpecialization(int id);
	
	void updateSpecialization(Specialization specialization);

	List<Specialization> getAllSpecialization();

	Specialization getSpecializationById(int id);
}
