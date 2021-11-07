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

import com.adl.main.model.BonusModel;
import com.adl.main.repository.BonusRepository;

@RestController
public class BonusController {

	@Autowired
	BonusRepository bonusRepo;
	
	@GetMapping("/bonus")
	public List<BonusModel> getTitle(){
		List<BonusModel> lstbonus = bonusRepo.findAll();
		return lstbonus;
	}
	
	@PostMapping("/bonus")
	public BonusModel saveBonus(@RequestBody BonusModel bonus) {
		return bonusRepo.save(bonus);
	}
	
	@PutMapping("/bonus")
	public BonusModel updateBorkerModel(@RequestBody BonusModel bonus) {		
		return bonusRepo.save(bonus);
	}
	
	@DeleteMapping("/bonus")
	public String deleteBonus(@RequestParam("worker_ref_id") int worker_ref_id) {
		bonusRepo.deleteById(worker_ref_id);
		return "delete berhasil";
	}
	
}
