package maveric;

public class StaticUsage {
	
	static int sno;
	static String sname;
	static String branch;
	
	static {
		//we can intialize static varibles using static block
		sno=10;
		sname="hanu";
		branch="EEE";
	}
	
	static Object add() {
		return sno+" "+sname+" "+branch;
		
	}
	public static void main(String[] args) {
		System.out.println(sno);
		System.out.println(add());
		
		StaticUsage s=new StaticUsage();
		System.out.println(StaticUsage.sno);//static varible memory created at the time of class loading
		System.out.println(s.sname);//static data comman to all instances
		System.out.println(s.branch);//we can get static data without creating object
		StaticUsage s2=new StaticUsage();
		System.out.println(StaticUsage.sno);//static varible memory created at the time of class loading
		System.out.println(s.sname);//static data comman to all instances
		System.out.println(s.branch);//access static data by using class name and directly by varible.
		
	}

}
