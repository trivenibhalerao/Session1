package object.methods.demo;

public class ToStringDemo extends Object{

	String str ="Method toString()";
	int val=5;
	
	public String toString()
	{
		return "Test";
	}
		
	public static void main(String[] args) {
		ToStringDemo demo = new ToStringDemo();
		ToStringDemo demo1 = new ToStringDemo();
		
		System.out.println(demo.toString());
		System.gc();
		System.out.println(demo);
		
		
		//print string representation of object
	}
	
	
}
