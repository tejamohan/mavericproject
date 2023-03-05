package maveric;

/**
 * @author Hp
 *
 */
/**
 * @author Hp
 *
 */
public class Car {
	
	private  int noOfCylinders;
	private String bodyType;
	private static int airBags;
	

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public static int getAirBags() {
		return airBags;
	}

	public static void setAirBags(int airBags) {
		Car.airBags = airBags;
	}

	public void engineStart() {
		System.out.println("Engine Started");
	}
	
   public static int wheels(int noOfWheels) {
	   
	return noOfWheels;
	   
   }

@Override
public String toString() {
	return "Car [noOfCylinders=" + noOfCylinders + ", bodyType=" + bodyType + "]";
}
   
   
   

   
	
	
	
	

}
