package object.methods.demo;

public class CloneDemo implements Cloneable{
	
	int value;
	String str;
	
	public CloneDemo(int value, String str){
		this.value=value;
		this.str=str;
		//test
	}
	
	public static void main(String[] args) {
		CloneDemo d = new CloneDemo(100, "Clone Test");
		System.out.println(d.value);
		System.out.println(d.str);
		
		try {
			CloneDemo d1 = (CloneDemo)d.clone();
			
			System.out.println(d1.value);
			System.out.println(d1.str);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
