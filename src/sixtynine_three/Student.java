package sixtynine_three;

import java.util.ArrayList;

public class Student {
	String name;
	ArrayList<Float> points = new ArrayList<Float>();
	
	public Student(String name, float one, float two, float three) {
		this.name = name;
		this.points.add(one);
		this.points.add(two);
		this.points.add(three);
	}
	
	public void result() {
		float sum = points.get(0) + points.get(1) + points.get(2);
		System.out.println("FINAL GRADE = " + sum);
		if(sum > 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED \nMISSING " + (60 - sum) + "POINTS");
		}
	}
}
