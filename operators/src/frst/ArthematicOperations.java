package frst;

public class ArthematicOperations {
	private int x;
	private int y;
	public ArthematicOperations(int x,int y) 
	{
		this.x=x; 
		this.y=y;
	if(x>=0 && y>=0) {

	    // addition operator
	    System.out.println("x + y = " + (x + y));

	    // subtraction operator
	    System.out.println("x - y = " + (x - y));

	    // multiplication operator
	    System.out.println("x * y = " + (x * y));

	    // division operator
	    System.out.println("x / y = " + (x / y));

	    // modulo operator
	    System.out.println("x % y = " + (x % y));
		}
	}
}