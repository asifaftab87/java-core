package org.bean.ex;

public class Employee {
	
		private int id;
		private String name;
		private int age;
		private  String addrs;
		private double salary;
		
		public Employee()
		{
			
		}
		
		public void setId(int id)
		{
			this.id=id;
		}
		
		public void setName(String name)
		{
			this.name=name;
		}
		
		public void setAge(int age)
		{
			this.age=age;
		}
		
		public void setAddrs(String addrs)
		{
			this.addrs=addrs;
		}
		
		public void setSalary(double salary)
		{
			this.salary=salary;
		}
	
		
		public int getId()
		{
			return id;
		}
		
		public String getName()
		{
			return name;
		}
		
		public int getAge()
		{
			return age;
		}
		
		public String getAddrs()
		{
			return addrs;
		}
		
		public double getSalary()
		{
			return salary;
		}
}
