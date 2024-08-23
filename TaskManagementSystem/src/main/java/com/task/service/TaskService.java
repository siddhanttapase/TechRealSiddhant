package com.task.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.entity.Task;
import com.task.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository repository;

	// create
	public Task createTask(Task task) {

		return repository.save(task);

	}

	// update
	public Task updateTask(Long id, Task taskDetails) {
		Task task = repository.findById(id).orElseThrow(() -> new RuntimeException("Invalid Id"));
		task.setStatus(taskDetails.getStatus());
//		task.setTitle(taskDetails.getTitle());
//		task.setDescription(taskDetails.getDescription());
//		task.setDuedate(taskDetails.getDuedate());
		return repository.save(task);

	}

	// getAll
	public List<Task> getAllTask() {

		return repository.findAll();
	}

//	@SuppressWarnings("unchecked")
//	public List<Task> getAllDueDateTask(Date date) {
//		Date saveDueDAte = null;
//		if (date.equals(new Date())) {
//			saveDueDAte=repository.save(date);
//		}
//		return (List<Task>) repository.findAllDate(saveDueDAte);
//		
//
//	}

}
