package maveric;

public class AccessModifiers {
	
	private int eno;
	private String name;
	private double salary;
	         String designation="Software Engineer";
	
	
	        
	
	
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	public AccessModifiers(int eno, String name, double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	protected void name() {
		System.out.println("diplay access modifiers");
	}
	
    public static void main(String[] args) {
		AccessModifiers am=new AccessModifiers(1,"teja",6500.00);
		System.out.println(am.eno);
		System.out.println(am.name);
		System.out.println(am.salary);
		System.out.println(am.designation);
		am.name();
	}
	
	
	
	
}
