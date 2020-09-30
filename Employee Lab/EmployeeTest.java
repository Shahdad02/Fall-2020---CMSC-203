
public class EmployeeTest {

	public static void main(String[] args) {
		
		//created 3 objects that follow the constructors format
		Employee oscar = new Employee("Oscar", 01, "Marketing", "Sales");
		System.out.println(oscar);
		
		Employee mary = new Employee("Mary", 02, "Accounting", "Finance");
		System.out.println("\n" + mary);
		
		Employee tom = new Employee("Tom", 03, "Front Desk", "Receptionist");
		System.out.println("\n" + tom);
		
		//here shows how the getter methods are printed
		System.out.println("\n" + oscar.getName());
		System.out.println(oscar.getIdNumber());
		System.out.println(oscar.getDepartment());
		System.out.println(oscar.getPosition());
		
		//here shows how setter methods set newer values to the objects
		oscar.setName("Daniel");
		oscar.setIdNumber(04);
		oscar.setDepartment("Research");
		oscar.setPosition("Research Associate");
		System.out.println("\n" + oscar);
		
		
	}

}
