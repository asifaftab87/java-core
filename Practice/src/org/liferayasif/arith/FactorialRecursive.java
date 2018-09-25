package org.liferayasif.arith;

public class FactorialRecursive {

	public static void main(String[] args) {

		FactorialRecursive fr = new FactorialRecursive();
		
		long r = fr.factorial(4);
		System.out.println("res: "+r);
	}
	
	public long factorial(long n){
		
		long res;
		
		if(n==1)
			return 1;
		
		res = factorial(n-1) * n;
		
		return res;
	}

}
