package com.example.demo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class TaskHardCodedService {
	
	private static List<Task> tasks = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		tasks.add(new Task(++idCounter, "v130", "todo 1", "this is a description 1", new Date(), "todo"));
		tasks.add(new Task(++idCounter, "v130", "doing 1", "this is a description 5", new Date(), "doing")); 
		tasks.add(new Task(++idCounter, "v130", "done 1", "this is a description 3", new Date(), "done")); 
	}

	public List<Task> findAll() {
		return tasks;
	}
	
	public Task findById(long id) {
		for(Task task: tasks) {
			if (task.getId() == id) {
				return task;
			}
		}
		return null;
	}
	
	public Task deleteById(long id) {
		Task task = findById(id);
		if (task == null) return null;	// check if we are able to find the task
		if (tasks.remove(task)) {	// check if we are able to delete the task
			return task;
		}
		return null;
	}
	
}
