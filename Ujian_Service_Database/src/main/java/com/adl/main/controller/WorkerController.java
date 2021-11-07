package com.adl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adl.main.model.WorkerModel;
import com.adl.main.repository.WorkerRepository;


@RestController
public class WorkerController {
	
	@Autowired
	WorkerRepository workerRepo;
	
	@GetMapping("/worker")
	public List<WorkerModel> getWorker(){
		List<WorkerModel> lstWorker = workerRepo.findAll();
		return lstWorker;
	}
	
	@PostMapping("/worker")
	public WorkerModel saveWorker(@RequestBody WorkerModel worker) {
		return workerRepo.save(worker);
	}
	
	@PutMapping("/worker")
	public WorkerModel updateWorkerModel(@RequestBody WorkerModel worker) {		
		return workerRepo.save(worker);
	}
	
	@DeleteMapping("/worker")
	public String deleteWorker(@RequestParam("worker_id") int worker_id) {
		workerRepo.deleteById(worker_id);
		return "delete berhasil";
	}
	
	@GetMapping("/salary")
	public WorkerModel getWorkerSalary(@RequestParam(value="salary") String salary) {
		WorkerModel worker = workerRepo.getWorkerSalary(salary);
		return worker;
	}
}
