package eg2;

public class Main {

	public static void main(String[] args) {

		Team t1=new Team(9000, "INDIA", "Gary Cristen");
		Player p1 = new Player(100, "Sachin", "Cricket", "Opening Batsman", 66.66);
		p1.setTeam(t1);
		System.out.println("Printing details of player "+p1.getName());
		p1.printPlayer();
		
		
		Player p2=new Player(101, "MS Dhoni", "Cricket", "WicketKeeper Batsman", 55.55);
		p2.setTeam(t1);
		System.out.println("\nPrinting details of player "+p2.getName());
		p2.printPlayer();
		
		Team t2=new Team(9001, "India", "Some coach");
		Player p3=new Player(102, "Saina Neihwal", "Shuttle", "player", 88.88);
		p3.setTeam(t2);
		System.out.println("\nPrinting details of player "+p3.getName());
		p3.printPlayer();
		
		Project pj1=new Project(24, "Surya");
		Address a1=new Address(204, "Gardens", "Guntur","AP", 522001);
		Employee e1= new Employee(7344, "Surya"," Trainee", 5000);
		e1.setProject(pj1);
		e1.setPresentAddress(a1);
		e1.setPermanentAddress(a1);
		System.out.println("\nPrinting deteails of Employee ");
		e1.printEmployee();

	}

}
