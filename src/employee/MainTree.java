package employee;

import java.util.TreeMap;

public class MainTree {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sanjit", 20000);
		Employee e2 = new Employee(2, "Rajesh", 40000);
		Employee e3 = new Employee(3, "Sanjit", 28000);
		Employee e4 = new Employee(1, "naman", 4000);
		Employee e5 = new Employee(5, "Tushar", 20000);
		
		TreeMap<Employee, String> tmap = new TreeMap<>((x,y)->x.getSalary()-y.getSalary());
		tmap.put(e1, "Telus");
		tmap.put(e2, "Microsoft");
		tmap.put(e3, "Udemy");
		tmap.put(e4, "Blackstone");
		tmap.put(e5, "Google");
		System.out.println(tmap);
	}

}
