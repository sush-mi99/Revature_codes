package eg2;

public class Employee extends Person {
	
	private String designation;
	private double salary;
	private Project project;
	private Address presentAddress;
	private Address permanentAddress;

	public Employee(int id,String name,String designation, double salary) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Address getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	public void printEmployee()
	{
		printPerson();
		System.out.println("Designation :"+designation);
		System.out.println("Salary :"+salary);
		project.projectdetails();
		System.out.println("Printing Present Address");
		presentAddress.printAddress();
		System.out.println("Printing Permanent Address");
		permanentAddress.printAddress();
	}

 }
