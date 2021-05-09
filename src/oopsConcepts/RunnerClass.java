package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA Emp1 = new ClassA(1000,"Sujith","Xyz");
		ClassA Emp2 = new ClassA();
		
		Emp1.Display();
		
		ClassB Obj1 = new ClassB();
		
		Obj1.Name = "Raj";
		Obj1.Salary = 1000;
		Obj1.OrgName = "PQR";
		
		Obj1.Display();
		Obj1.show();
		
		ClassC Obj2 = new ClassC();
		
		Obj2.run();

	}

}
