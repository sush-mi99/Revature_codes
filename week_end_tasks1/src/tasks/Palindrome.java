package tasks;

public class Palindrome {

		public static void main(String[] args) {
		    int[] array = {191,29,989,789,123,9449};

		   
		    for (int i = 0; i < array.length; i++) {
		        
		             
		            	int n = array[i];
		    			int sum = 0, temp = 0;
		    			
		    			while (n != 0) {
		    				temp = n % 10;
		    				sum = sum * 10 + temp;
		    				n /= 10;
		    			}
		    			
		    			if (sum == array[i])
		    				
		    			System.out.println(" "+array[i]);
		                
		            }
		}

}
