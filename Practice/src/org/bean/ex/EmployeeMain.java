package org.bean.ex;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Employee E = new Employee();
			
			E.setId(17);
			E.setName("MD.SHAHBAZ");
			E.setAge(24);
			E.setAddrs("KOLKATA");
			E.setSalary(45000);
			
			
			int id= E.getId();
			String name=E.getName();
			int age= E.getAge();
			String addrs=E.getAddrs();
			double salary=E.getSalary();
			
			System.out.println("Id: "+id );
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Address: " +addrs);
			System.out.println("Salary: "+salary);
			
	}

}
