package maveric;

public class InterfaceExample implements DefaultMethods{

	@Override
	public void display() {
		System.out.println("Overridden method");
		
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
		// default methods from java8 onwards
	
	}
	
	public int test() {
		return DefaultMethods.super.substract(20, 10);
	}

	@Override
	public int multiply(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	public static void main(String[] args) {
		
		DefaultMethods df=new InterfaceExample();
		df.display();
		System.out.println(df.multiply(10));
		System.out.println(df.substract(40,25));
		
	}
	
	
}
