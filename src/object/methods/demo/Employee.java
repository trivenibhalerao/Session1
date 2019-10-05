package object.methods.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Employee implements Cloneable{
	int emp_id;
	String emp_name;
	double salary;
	
//	Employee E1 = E01, "Triveni", 19290
//	E2 should be cloned

	public Employee(int emp_id, String emp_name, double salary){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
	}
	//Overriding clone method
	public Object clone() throws CloneNotSupportedException{
		System.out.println("In overriden method...");
		return super.clone();
	}
	
	public static strictfp void main(String[] args) throws CloneNotSupportedException, IOException {
		
		//BufferedReader to get inputs from console/users
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//Scanner class
		Scanner sc = new Scanner(System.in);
		
//		String scStr= sc.nextLine();
//		int scInt =sc.nextInt();
//		float scFloat =sc.nextFloat();
		
		int empID =sc.nextInt();
		String empName = br.readLine();
		double empSalary=sc.nextDouble();
		Employee E1 = new Employee(empID, empName, empSalary);
		Employee E2 = (Employee)E1.clone();
		
		System.out.println(E1.emp_id);
		System.out.println(E1.emp_name);
		System.out.println(E1.salary);
		
		System.out.println(E2.emp_id);
		System.out.println(E2.emp_name);
		System.out.println(E2.salary);
		
		double val1=100.11;
		double val2=200.22;
		double valResult=val1+val2;
		System.out.println(valResult);
		
		System.out.println(Math.tan(347));
		System.out.println("Square root of 9 is "+Math.sqrt(9));

		
	}
	
	
}
