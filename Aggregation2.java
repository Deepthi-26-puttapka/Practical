package javaprograms;

public class Aggregation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee("Deepthi","Software Engineer");
	    Department d=new Department(em,"Accenture","hyderabad",20222);
	    d.main();

	}

}

class Employee{
	String EmployeeName;
	String role;
	Employee(String EmployeeName,String role)
	{
		this.EmployeeName=EmployeeName;
		this.role=role;
	}
}
	class Department{
	    Employee Employee;
		String Companyname;
		String location;
		int EmployeeID;
		Department(Employee Employee,String Companyname,String location ,int EmployeeID )
		{
		    this.Employee=Employee;
			this.Companyname=Companyname;
			this.EmployeeID=EmployeeID;
			this.location=location;
		}
		public void main() {
		    System.out.println("Employee detsils:");
		    System.out.println("Employee name:"+Employee.EmployeeName);
		    System.out.println("Employee role:"+Employee.role);
		    System.out.println("Company Name:"+Companyname);
		    System.out.println("Location:"+location);
		    System.out.println("EmployeeId:"+EmployeeID);
		
		}
}
