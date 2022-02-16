package emp.det;

public class EmployeeDetails 
{
public void empName()
{
	System.out.println("sowmi");
}
public void empAddress()
{
	System.out.println("tvmalai");
}
public static void main(String[]args)
{
	EmployeeDetails e = new EmployeeDetails();
	e.empName();
	e.empAddress();
	VehicleDetails v = new VehicleDetails();
	    v.Honda();
		v.Tvs();
		
}
}
