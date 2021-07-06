package tasks;

public class Prime {

	public static void main(String[] args) {
		 int array[]  = {25,16,36,3,93,43,89};
		    
		 
		 for (int i = 0; i < array.length; i++) 
		 {
			 int n = 0;
				for (int j = 1; j <= array[i]; j++) 
				{
					if (array[i] % j == 0)
						n++;
					}
				if (n == 2) 
				{
					System.out.println(" " + array[i]);
					n = 0;
					}
			}
	}
}