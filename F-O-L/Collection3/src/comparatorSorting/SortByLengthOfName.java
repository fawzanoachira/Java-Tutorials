package comparatorSorting;

import java.util.Comparator;

public class SortByLengthOfName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.length()-o2.name.length();
	}

}
