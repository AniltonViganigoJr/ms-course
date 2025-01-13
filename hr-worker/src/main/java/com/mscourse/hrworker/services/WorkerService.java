package com.mscourse.hrworker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscourse.hrworker.entities.Worker;
import com.mscourse.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository workerRepository;
	
	public List<Worker> findAll(){
		return workerRepository.findAll();
	}
	
	public Worker findById(Long id){
		return workerRepository.findById(id).get();
	}
}