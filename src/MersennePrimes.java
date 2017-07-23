/*******************************************************************
  Program: Mersenne Primes
  Author: Bright Siyanda Wanda
  Date: 19 July 2017
  
  Description: Program to print as many as Mersenne Primes as 
  possible.
  
  Program Limitations: The code after the 9th Mersenne Prime, it 
                       goes on forever trying to get the next value. 

*******************************************************************/

public class MersennePrimes {
	
	public static boolean isPrime(long N)
	{
		for (int i = 2;i<=Math.sqrt(N);i++)
	    {
			if (N%i == 0)
	        return false;
	    }
	    return true;
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = 1;
		long prevValue = 0;
		System.out.println("Number" +"\t" + "Mersenne Prime");
		while(true)
		{
			if (isPrime(i) && isPrime((long) (Math.pow(2, i)-1)))
		    {
				System.out.println(i +"\t" + (long) (Math.pow(2, i)-1));
				
				if(prevValue == (int)Math.pow(2, i)-1)
				{
					break;
				}
				
				prevValue = (long)Math.pow(2, i)-1;
		    }	
			i++;
		}
	}
}
