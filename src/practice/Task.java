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
	
	//順序を定義
	@Override
	public int compareTo(Task list) {
		return LocalDate.compare( this.time,list.getTime());
	}
		 
}

//https://www.techiedelight.com/ja/sort-list-multiple-attributes-java/