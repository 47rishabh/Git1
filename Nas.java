package Basic_assgn;

import java.util.Scanner;

public class Nas {
	String name;
	int salary;
	int age;
	
	void put() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name= ");
		name=s.next();
		System.out.println("Enter age= ");
		age=s.nextInt();
		System.out.println("Enter salary= ");
		salary=s.nextInt();
	}
	void display()
	{
		System.out.println(name+" "+age+" "+salary);
}


	public static void main(String[] args) {
		Nas n=new Nas();
		n.put();
		n.display();
		
	}

}
