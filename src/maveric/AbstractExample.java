package maveric;

import lombok.Synchronized;

public abstract class AbstractExample {
	
	abstract void show();
	abstract int div(int a,int b);
	//welcome to git 
	static int x=20;
	int y=20;
	static {
		System.out.println("static block in abs class ");
	}

	{
		System.out.println("nonstatic block in abs class");
	}
	
	public AbstractExample() {
		System.out.println("we can call constructor in abstract class");
	}
	
	static void display() {
		System.out.println("static method in abs class");
	}
	public boolean isEven(int x) {
		return x%2==0;
		
	}
	
	
	
}
