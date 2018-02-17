package com.suchi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.suchi.beans.Institute;
import com.suchi.repo.InstituteRepository;

@Service
public class InstituteService {		
	
	@Autowired
	InstituteRepository instituteRepo;
	
	public List<Institute> getAllInstitutes() {
		ArrayList<Institute> institutes = new ArrayList<Institute>(); 
		Iterable<Institute> i = instituteRepo.findAll();
		for (Institute insti : i) {
			institutes.add(insti);
		}
		return institutes;
	}
	
	public Institute getAnInstitute(int id) {
		return instituteRepo.findOne(id);
	}
	
	public void addAnInstitute(Institute t) {
		instituteRepo.save(t);
		//topics.add(t);
	}
	
	public void updateAnInstitute(Institute t) {
		instituteRepo.save(t);
	}
	
	public void deleteAnInstitute(int id) {
		instituteRepo.delete(id);
	}
}
