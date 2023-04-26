package com.example.demo.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.task.Task;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TaskController {
	
	@Autowired	
	private TaskHardCodedService taskHardCodedService;

	@GetMapping(path = "/users/{userId}/tasks" )
	public List<Task> getAllTasks(@PathVariable String userId) {
		return taskHardCodedService.findAll(); 
	}
	
	@DeleteMapping(path = "/users/{userId}/tasks/{taskId}" )
	public ResponseEntity<Void> deleteTask(@PathVariable String userId, @PathVariable long taskId) {
		Task task = taskHardCodedService.deleteById(taskId);
		if(task!=null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
