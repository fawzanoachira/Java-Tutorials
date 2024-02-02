package sorting;

import java.util.Comparator;

import com.Employee;

public class SortEmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId().compareTo(o2.getEmpId());
	}

}
