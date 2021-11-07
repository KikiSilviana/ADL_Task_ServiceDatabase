package com.adl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adl.main.model.TitleModel;
import com.adl.main.repository.TitleRepository;



@RestController
public class TitleController {
	
	@Autowired
	TitleRepository TitleRepo;
	
	@GetMapping("/title")
	public List<TitleModel> getTitle(){
		List<TitleModel> lstTitle = TitleRepo.findAll();
		return lstTitle;
	}
	
	@PostMapping("/title")
	public TitleModel saveWorker(@RequestBody TitleModel title) {
		return TitleRepo.save(title);
	}
	
	@PutMapping("/title")
	public TitleModel updateTitleModel(@RequestBody TitleModel title) {		
		return TitleRepo.save(title);
	}
	
	@DeleteMapping("/title")
	public String deleteTitle(@RequestParam("worker_ref_id") int worker_ref_id) {
		TitleRepo.deleteById(worker_ref_id);
		return "delete berhasil";
	}
}

