package object.methods.demo;

public class Test {
	
	@Override
	protected void finalize(){
		//closeing file object
		//Closing printing object
		//disposing objects
		System.out.println("Finalize method called...");
	}
	
	public void garbageCollecctionMyMethod()
	{
		System.gc();
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.hashCode());
		
		t=null;
		t.garbageCollecctionMyMethod();
		System.out.println("END");
	}
	
}


