package tasks;

public class Vowels {
	public static void main(String[] args) {
		String s = "hello hi good evening everyone hope you are enjoying progamming with java";
		if (s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u")) {
			System.out.println("All Vowels are Present ");
		}else
		{
			System.out.println("All Vowels are Not Present ");
		}

	}

}
