package sorting;

import java.util.Comparator;

import com.Employee;

public class SortEmployeeByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer age1 = o1.getEmpAge();
		Integer age2 = o2.getEmpAge();
		return age1.compareTo(age2);
	}

}
