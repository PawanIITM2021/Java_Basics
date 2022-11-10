 package javaFullCourse;

interface vehicle
{
	String Name="TVS";  // public + static + final
	int Speed=100;      // public + static + final
	
	void start();		// public + abstract
	void stop();		// public + abstract
	default void color()
	{
		System.out.println("TVS Color is Red");
	}
	static void speed()
	{
		System.out.println("Tvs Speed is 100 km/H");
	}
}
public class Customer_ implements vehicle {
	@Override
	public void start()
	{
		System.out.println("start(): insert key & press start button  " +Name);
	}
	@Override
	public void stop()
	{
		System.out.println("stop(): exit key");
		
	}
	
	public static void main(String [] args) {
		
		Customer_ c=new Customer_();
		c.start(); c.stop(); c.color();
		vehicle.speed();
		System.out.println(Speed);
	}
}
