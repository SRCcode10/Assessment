package employee;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sanjit", 20000);
		Employee e2 = new Employee(2, "Rajesh", 40000);
		Employee e3 = new Employee(3, "Sanjit", 28000);
		Employee e4 = new Employee(4, "naman", 4000);
		Employee e5 = new Employee(5, "Tushar", 20000);

		Set<Employee> hset = new HashSet<>();
		hset.add(e1);
		hset.add(e2);
		hset.add(e3);
		hset.add(e4);
		hset.add(e5);
		hset.stream().filter(e->e.getSalary()<10000).forEach(e->e.addBonus());
		System.out.println(hset);

	}

}
