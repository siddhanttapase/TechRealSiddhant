package com.task.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

//	Date findAllDate(Date date);
//
//	Date save(Date date);

}
