package OOPS;

public class pra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Doctor();
		
		Doctor d1=new Doctor("xya","newrow",200) ;
		 System.out.println(d1.name);
		 
//		 Employee.CEO="lord";
//		 Employee.company="mageclane";
		 
		 Employee e1 = new Employee();
		 e1.id=12;
		 e1.name="grey";
		 
		 Employee e2 = new Employee();
		 e1.id=13;
		 e1.name="may";
		 
		 Employee e3 = new Employee();
		 e1.id=14;
		 e1.name="luffy";
		 
		 Employee.setCEO("choper");
		System.out.println(Employee.getCEO());
	}

}
