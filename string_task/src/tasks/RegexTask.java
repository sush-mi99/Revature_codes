package tasks;

public class RegexTask {
	
	public static void main(String[] args) {
		
		String s = "9465 5492 7361";
		if (s != null && s.matches("[0-9]{4} [0-9]{4} [0-9]{4}")) {
			System.out.println("Valid Adhar");
		} else {
			System.out.println("Invalid Adhar");
		}
	}

}