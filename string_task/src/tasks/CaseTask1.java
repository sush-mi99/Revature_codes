package tasks;

public class CaseTask1 {
	public static void main(String[] args) {
		String s = "hello hi good evening everyone hope you are enjoying progamming with java";
		StringBuilder sb = new StringBuilder();
		String ar[] = s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() % 2==0)
			{
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			}
			else 
			{
			 int x=ar[i].length()/2;
			 sb.append(ar[i].substring(0,x)).append(Character.toUpperCase(ar[i].charAt(x))).append(ar[i].substring(x+1)).append(" ");
			
			}
		}
		System.out.println(sb.toString().trim());
	}
}
