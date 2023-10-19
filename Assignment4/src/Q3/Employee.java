package Q3;


	public class Employee {
		private int empid;
		private String name;
		private int Salary;
		
		
		public Employee(int empid, String name, int salary) {
			super();
			this.empid = empid;
			this.name = name;
			this.Salary = salary;
		}
		
		

		public Employee() {
			super();
			empid =0;
			name = "None";
			Salary = 0;
		}



		@Override
		public String toString() {
			return "empid : " + empid + "\nname : " + name + "\nSalary : " + Salary;
		}



		public int getSalary() {
			return Salary;
		}



		public void setSalary(int salary) {
			Salary = salary;
		}
		
		
		

	}
