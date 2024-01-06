package in.Assign8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class utility_Report {
	private Map<String,Double>m;

	public utility_Report(Map<String, Double> map) {
		this.m = map;
	}
	
	public void show_report(List<Student> l1) {
		Scanner sc = new Scanner(System.in);
		for(Student S:l1) {
			this.m.put(S.getName(),S.getPercentage());
		}
			
		Set<String> keys = this.m.keySet();
		for(String k:keys) {
			System.out.println(" "+k+" ---> "+this.m.get(k));
		}
	}
	
	
	

}
