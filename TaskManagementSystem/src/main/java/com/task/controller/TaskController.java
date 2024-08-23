package com.task.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.Task;
import com.task.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	private TaskService service;

	@PostMapping("/create")
	public Task create(@RequestBody Task task) {
		return service.createTask(task);

	}
	
	@PutMapping("/update/{id}")
	public Task update(@PathVariable Long id, @RequestBody Task taskDetails) {
		
		return service.updateTask(id,taskDetails);
		
	}
//	@GetMapping("/getall/{date}")
//	public List<Task> getAllDueDateTask(@PathVariable Date date){
//		return service.getAllDueDateTask(date);
//		
//	}

}
