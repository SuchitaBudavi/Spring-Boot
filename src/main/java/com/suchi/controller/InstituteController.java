package com.suchi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suchi.beans.Institute;
import com.suchi.beans.Topic;
import com.suchi.service.InstituteService;
import com.suchi.service.TopicService;

@RestController
public class InstituteController {

	@Autowired
	InstituteService instituteService;
	
	@RequestMapping("/institutes")
	public List<Institute> getAllInstitutes(){
		return instituteService.getAllInstitutes();
	}
	
	@RequestMapping("/institutes/{id}")
	public Institute getAnInstitute(@PathVariable("id") int id) {
		return instituteService.getAnInstitute(id);
	}
	
	@RequestMapping(value = "/institutes",method=RequestMethod.POST)
	public void addAnInstitute(@RequestBody Institute t) {
		instituteService.addAnInstitute(t);
	}
	
	@RequestMapping(value = "/institutes",method=RequestMethod.PUT)
	public void updateAnInstitute(@RequestBody Institute t) {
		instituteService.updateAnInstitute(t);
	}
	
	@RequestMapping(value = "/institutes/{id}",method=RequestMethod.DELETE)
	public void deleteAnInstitute(@PathVariable("id") int id) {
		instituteService.deleteAnInstitute(id);
	}
}
