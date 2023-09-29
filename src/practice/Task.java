package practice;

import java.time.LocalDate;

public  class Task implements Comparable<Task> {
	private LocalDate time ;
	private String task;
	
	public Task(LocalDate time,String task) {
		this.time = time;
		this.task = task;
	}
	
	public LocalDate getTime() {
		return this.time;
	}
	
	public String getTask() {
		return this.task;
	}
	
	@Override
	public String toString() {
		return  this.time + ":" + this.task ;
	}
	
	//順序を定義
	@Override
	public int compareTo(Task task) {
		return this.time.compareTo(task.time);
	}
		 
}
