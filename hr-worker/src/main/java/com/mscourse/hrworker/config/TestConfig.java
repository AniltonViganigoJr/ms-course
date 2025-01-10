package com.mscourse.hrworker.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mscourse.hrworker.entities.Worker;
import com.mscourse.hrworker.repositories.WorkerRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private WorkerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Worker worker1 = new Worker(null, "Worker Number One", 1200.00);
		Worker worker2 = new Worker(null, "Worker Number Two", 2500.00);
		Worker worker3 = new Worker(null, "Worker Number Three", 7800.00);
		Worker worker4 = new Worker(null, "Worker Number Four", 6300.00);
		
		repo.saveAll(Arrays.asList(worker1, worker2, worker3, worker4));
	}
}