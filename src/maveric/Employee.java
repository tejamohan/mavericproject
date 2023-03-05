package maveric;




public class Employee {


	private int empNo;
	private String empName;
	private int empAge;
	private double salary;
	
	
	
	public Employee(int empNo, String empName, int empAge, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAge = empAge;
		this.salary = salary;
	}
	
	
      
    public int getEmpNo() {
		return empNo;
	}



	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
    public boolean equals(Object obj) {
    	Employee emp=(Employee)obj;
		return this.empNo==emp.empNo&& this.empName==emp.empName&&this.empAge==emp.empAge;

    

    }
    
    
    @Override
    public int hashCode() {
    	
    	return this.empNo;
    }

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAge=" + empAge + ", salary=" + salary + "]";
	}
	
	
	
	
}
