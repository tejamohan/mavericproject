package maveric;


public interface DefaultMethods {
	
  public abstract void display() ;
  public abstract int multiply(int a);
  
  
	  default  int substract(int a,int b) {
		System.out.println("in side default method" +a);
		return a-b;
	}
	//  static void add(int a,int b) {
	//	  int c=a+b;
	//	  System.out.println(c);
	 // }


	

}


	
	
