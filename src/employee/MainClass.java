package employee;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainClass {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sanjit", 20000);
		Employee e2 = new Employee(2, "Rajesh", 40000);
		Employee e3 = new Employee(3, "Sanjit", 28000);
		Employee e4 = new Employee(1, "naman", 4000);
		Employee e5 = new Employee(5, "Tushar", 20000);
		
		Map<Employee,String> emap = new LinkedHashMap<>();
		emap.put(e1, "Telus");
		emap.put(e2, "Microsoft");
		emap.put(e3, "Udemy");
		emap.put(e4, "Blackstone");
		emap.put(e5, "Google");
		System.out.println(emap);
		
	}

}
