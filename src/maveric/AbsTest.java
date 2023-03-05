package maveric;

public class AbsTest extends AbstractExample{

	@Override
	void show() {
		System.out.println("partial unimplemented class");
		
	}

	@Override
	int div(int a, int b) {
		
		return a/b;
	}

	
	static int b=70;
	int c=80;
	
	public static void main(String[] args) {
		AbsTest abs=new AbsTest();
		abs.isEven(10);
		abs.show();
		System.out.println(b);
		System.out.println(abs.c);
	}
	
}
