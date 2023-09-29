package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		Task task1 = new Task(LocalDate.of(2021, 10, 21),"牛乳を買う");
		Task task2 = new Task(LocalDate.of(2021, 9, 15),"○○社面談。");
		Task task3 = new Task(LocalDate.of(2021, 12, 4),"手帳を買う。");
		Task task4 = new Task(LocalDate.of(2021, 8, 10),"散髪に行く。");
		Task task5 = new Task(LocalDate.of(2021, 11, 9),"スクールの課題を解く。");
		List<Task> lists = new ArrayList<Task>();
		
		lists.add(task1);
		lists.add(task2);
		lists.add(task3);
		lists.add(task4);
		lists.add(task5);
		 
		Collections.sort(lists);
		
		for (Task list:lists) {
			System.out.println(list);		
		}
	}

}
//https://qiita.com/kenduck/items/1d4ce84a476eac6247eb