package tasks;

import java.util.Arrays;

public class Duplicate_String {

	public static void main(String[] args) {
	      String stringWithDuplicates = "hello hi good evening everyone hope you are enjoying progamming with java";
	      StringBuffer sb = new StringBuffer();
	      char[] arr = stringWithDuplicates.toCharArray();
			Arrays.sort(arr);
			for (int i = 0; i < arr.length-1; i++) {

				if(arr[i]!=arr[i+1])
				{
					sb.append(arr[i]);
				}
			}
			sb.append(arr[arr.length-1]);
			System.out.println(sb);
	}
}
