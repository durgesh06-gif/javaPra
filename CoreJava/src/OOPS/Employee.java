package OOPS;

public class Employee {
	
	private static String company="mistery";
	private static String CEO="zoro";
	String name;
	int salry;
	int id;
	
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Employee.company = company;
	}
	public static String getCEO() {
		return CEO;
	}
	public static void setCEO(String cEO) {
		CEO = cEO;
	}

}
