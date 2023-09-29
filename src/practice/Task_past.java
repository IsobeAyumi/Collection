package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task_past {
	public static void main(String[] args) {
		
		//タスク内容の配列を生成
		//List<String> list1 = new ArrayList<String>();
	    String[] list1 = new String[] {"2021年10月21日 牛乳を買う。","2021年9月15日 ○○社面談。",
	    		"2021年12月4日 手帳を買う。","2021年8月10日 散髪に行く。","2021年11月9日 スクールの課題を解く。"};
        
		//list1の各要素の" "空白を日付と内容で分割　time:日付
		List<String> time = new ArrayList<String>();
		for (int i=0; i<list1.length; i++ ) {
			time.add(list1[i].split(" ")[0]);
			}
		
		//list1の各要素の" "空白を日付と内容で分割　do1:内容
		List<String> do1 = new ArrayList<String>();
		for (int i=0; i<list1.length; i++ ) {
			do1.add(list1[i].split(" ")[1]);
			}

		//日付をdatetime型に変換、time1のリストに格納
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy年M月dd日");
		DateTimeFormatter e = DateTimeFormatter.ofPattern("yyyy年MM月d日");
		List<LocalDate> time1 = new ArrayList<LocalDate>();
		time1.add( LocalDate.parse(time.get(0), f));
		time1.add( LocalDate.parse(time.get(1), d));
		time1.add( LocalDate.parse(time.get(2), e));
		time1.add( LocalDate.parse(time.get(3), d));
		time1.add( LocalDate.parse(time.get(4), e));

		//datetime型をキーに内容をmap1に格納
		Map<LocalDate, String> map1 = new HashMap<LocalDate, String>();
		for  (int i=0; i<do1.size(); i++ ) {
			map1.put(time1.get(i), do1.get(i));
		}
		
		//datetime型time1を日付順に並び替え
        Collections.sort(time1);

        //並び替えられたtime1をキーに内容の呼び出し
        for  (int i=0; i<map1.size(); i++ ) {
        	System.out.println(time1.get(i)+":"+map1.get(time1.get(i)));
        }		
	}
}	

