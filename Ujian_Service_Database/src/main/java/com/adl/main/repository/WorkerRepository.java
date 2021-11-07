package com.adl.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adl.main.model.WorkerModel;

public interface WorkerRepository extends JpaRepository<WorkerModel, Integer> {
	
	@Query(value="Select * From worker ORDER BY salary Desc LIMIT 5 = ?1",nativeQuery = true)
	WorkerModel getWorkerSalary(String salary);
	


}
