package maveric;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void NPE(String s) {
	
	}
	
	public static void main(String args[]) throws InterruptedException{  
		   try{  
		      Scanner scan=new Scanner(System.in);
		      System.out.println("Enter the values");
		      int a=scan.nextInt();  
		      int b=scan.nextInt();
		      int c=a/b;
		      System.out.println(c);
		      throw new InterruptedException();//we must catch or report checked exception
		   } catch(InputMismatchException nfe) {
			   System.out.println("Please pass only Integer values");
		   }catch(ArithmeticException ae) {
			   System.out.println("please Do Not pass second values as Zero");
		   }catch(InterruptedException ie) {
			  System.out.println(ie);
		   }finally{
			   System.out.println("In finally a:");
		   }
		   
		  }

	
	
}


