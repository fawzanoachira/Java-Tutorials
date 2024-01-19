package comparatorSorting;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Double salary1 = o1.salary;
		Double salary2 = o2.salary;
		return (int)(salary1 - salary2);
		
//		Integer salary12 = (int) o1.salary;
//		Integer salary22 = (int) o2.salary;
//		
//		return salary12 - salary22;
	}

}
