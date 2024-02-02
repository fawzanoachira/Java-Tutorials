package sorting;

import java.util.Comparator;

import com.Employee;

public class SortEmployeeBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Double salary1 = o1.getEmpSalary();
		Double salary2 = o2.getEmpSalary();
		return salary1.compareTo(salary2);
	}

}
