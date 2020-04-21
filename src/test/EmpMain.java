package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpMain {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(4,"RJ", "Ahmednagar"));
		list.add(new Employee(8,"Rushikesh", "Pune"));
		list.add(new Employee(3,"Joshi", "kothrud"));
		for (Employee e:list)
		{
			System.out.println(e);
		}
		Collections.sort(list, new Comparator<Employee>(
				) {

					@Override
					public int compare(Employee o1, Employee o2) {
						// TODO Auto-generated method stub
						return o1.getId()-o2.getId();
					}
	});
		System.out.println("----------------");
		for (Employee e:list)
		{
			System.out.println(e);
		}

	}

}
