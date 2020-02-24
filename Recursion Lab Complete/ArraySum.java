
public class ArraySum {

	public int sumOfArray(Integer[] myArray, int i) {
		
		if(i <= 0) {
			return 0;
		}
		
		return sumOfArray(myArray, i-1) + myArray[i -1];
		
		
		
	}
	
	
	public int Fibonacci(int i) {
		
		int f[] = new int[i+2];
		
		int n;
		
		f[0] = 0;
		f[1] = 1;
		
		
		for(n = 2; n <= i; n++) {
			
			f[n] = f[n-1] + f[n-2];
			
		}
		
		return f[i];
		
	}
	
}
