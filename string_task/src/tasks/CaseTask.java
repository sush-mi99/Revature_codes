package tasks;

public class CaseTask {
	
	public static void main(String[] args) {
		
		String s="hello hi good evening everyone hope you are enjoying progamming with java";
		StringBuilder sb = new StringBuilder();
		String ar[]=s.split(" ");
		for(int i =0;i<ar.length;i++) {	
			sb.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}
