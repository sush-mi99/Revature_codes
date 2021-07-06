package tasks;

public class Avg_Even_Odd {
	public static void main(String args[]) {
		int array[]={14,43,59,68,71,86}; 
		int oddSum=0,evenSum=0,evenCount=0,oddCount=0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2==0) 
			{
				evenSum=evenSum+array[i];
				evenCount++;
			}
			else
			{
				oddSum=oddSum+array[i];
				oddCount++;	
			}
		}
		double avgOdd=oddSum/oddCount; 
		double avgEven=evenSum/evenCount;
		System.out.println("\nAverage of even numbers are: "+avgEven);  
		System.out.println("\nAverage of odd numbers are: "+avgOdd);
	}
}
