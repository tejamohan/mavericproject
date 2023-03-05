package maveric;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(1,"teja",32,50000.00));
		e.add(new Employee(2,"nag",33,65000.00));
		e.add(new Employee(3,"dumbi",34,75000.00));
        e.add(new Employee(4,"dumbi",35,85000.00));
		
        int  i=0;
        e.forEach((s)->System.out.println(e.get(i)));
       System.out.println(e.indexOf(new Employee(2,"nag",33,65000.00)));
		
		System.out.println(e.contains(new Employee(4,"dumbi",35,85000.00)));
		
		e.removeIf((ff)->ff.getSalary()>75000);
		e.forEach((s)->System.out.println(s));
	      ListIterator<Employee> emp=e.listIterator();
	      while(emp.hasNext()) {
	    	  System.out.println(emp.next());
	    	  
	};
	
	    e.set(1,new Employee (2,"anish",33,65000.00));
	    e.forEach((s)->System.out.println(s));
		
	    e.sort((p1,p2)->p1.getEmpName().compareTo(p2.getEmpName()));
	    e.forEach((s)->System.out.println(s));
	    
	    
		
		
	}

}
