package com.hospital.system.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.system.model.Specialization;
import com.hospital.system.reprository.SpecializationRepository;
import com.hospital.system.service.SpecializationService;

@Service
public class SpecializationServiceImpl implements SpecializationService {

	@Autowired
	private SpecializationRepository specialRepo;

	@Override
	public void addspecialization(Specialization specialization) {

		specialRepo.save(specialization);

	}

	@Override
	public List<Specialization> getAllSpecialization() {

		return specialRepo.findAll();
	}

	@Override
	public void deleteSpecialization(int id) {

		specialRepo.deleteById(id);

	}

	@Override
	public void updateSpecialization(Specialization specialization) {

		specialRepo.save(specialization);

	}

	@Override
	public Specialization getSpecializationById(int id) {
		
		return specialRepo.findById(id).get();	
		
	}

	
}
