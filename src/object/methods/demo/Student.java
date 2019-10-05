package object.methods.demo;

public class Student {

	String sname = "Triveni";
	int roll_np=5;
	
	public String toString()
	{
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
	public int hashCode()
	{
		return roll_np;
	}
	
	public static void main(String[] args) {

		Student s = new Student();
		Student s1= new Student();
		Student s2=s;
		
		System.out.println(s);
		System.out.println(s.toString());
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s.equals(s1));//false
		System.out.println(s.equals(s2));//true
		
		Object obj = new Object();
		//obj belongs to class Object
		Class c = obj.getClass();
		System.out.println(c.getName());
		
		Object obj1 = new String();
		//obj belongs to class String
		Class c1 = obj1.getClass();
		System.out.println(c1.getName());
		
		Test t = new Test();
		t.garbageCollecctionMyMethod();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

//object.methods.demo.Student@1db9742
