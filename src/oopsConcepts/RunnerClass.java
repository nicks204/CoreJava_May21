package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClassA Emp1 = new ClassA(1000,"Sujith","Xyz");
		ClassA Emp2 = new ClassA();
		
		Emp1.Display();
		
		ClassB Obj1 = new ClassB();
		
		Obj1.Name = "Raj";
		Obj1.Salary = 1000;
		Obj1.OrgName = "PQR";
		
		Obj1.Display();
		Obj1.show();
		
		ClassC Obj2 = new ClassC();
		
		Obj2.run(); */
		
		
		MethodOverloading obj3 = new MethodOverloading();
		
		obj3.add(1, 2);
		obj3.add(1.1, 2.3);
		
		MethodOverrideChild obj4 = new MethodOverrideChild();
		
		obj4.display();
		
		AbstractChild obj5 = new AbstractChild();
		
		obj5.method2();
		obj5.method1();
		
		IntrfaceChild obj6 = new IntrfaceChild();
		obj6.method1();
		
		EncapsulationExample obj7 = new EncapsulationExample();
		
		obj7.setSalary(1000);
		
		System.out.println(obj7.getSalary());
		
	}

}
