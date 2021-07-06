package tasks;

import java.util.Arrays;

public class Second_Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {56,92,73,42,90,56,92,84 };
		Arrays.sort(arr);
		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		System.out.println(" " + temp[j-2]);

	}

}
