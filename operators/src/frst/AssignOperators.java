package frst;

public class AssignOperators {
	
	private int x;
	public AssignOperators(int x) 
	{
		this.x=x; 
		int num = 4;
		switch(x) {
		
		case 1:
			num = x;
		    System.out.println("num =: " + num);
		    break;
		case 2:
			num += x;
		    System.out.println("num +=: " + num);
		    break;
		case 3:
			num *= x;
		    System.out.println("num *=: " + num );
		    break;
		}

	}

}
