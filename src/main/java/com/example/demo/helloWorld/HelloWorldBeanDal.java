package com.example.demo.helloWorld;

// DispatcherServlet automatically convert returned class content into JSON with variables as keys
public class HelloWorldBeanDal {

	private String task;
	
	public HelloWorldBeanDal(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "task";
	}
	
	public String getTask() {
		return task;
	}
	
	public void setTask(String task) {
		this.task = task;
	}

}
