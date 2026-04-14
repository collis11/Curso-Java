package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		List<employee> list = new ArrayList<>();
		
		System.out.println("how many employees will be registered? ");
		 
		int N = sc.nextInt();
		
		for (int i = 0; i<N ; i++) {
			System.out.println("Employee # " + (i+1));
			System.out.println("Id: ");
			Integer id =sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name =sc.nextLine();
			System.out.println("salary: ");
			Double salary = sc.nextDouble();
			
			employee emp = new employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println("Enter the employee id thast will have salary increase: ");
		int idsalary = sc.nextInt();
		Integer pos = position (list, idsalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (employee emp : list) {
			System.out.println(emp);
		}
		
		
		
		
		sc.close();
	}
	public static Integer position(List <employee> list, int id ) {
		for (int i = 0; i< list.size(); i++) {
			if(list.get(i).getId() == id ) {
				return i;
			}
		}
		return null;
	}
}
