public class PrimeFinder{
	public static void pf(long start,long end) {

		//prime finder
		long x = start; final long limit = end;
		long count = x-1;
		int primes = 0;
		boolean exit = false;

		final long startTime = System.currentTimeMillis();

		while(x < limit)
		{
			if(x > 3 && x%2 == 0) exit = true;
			else if(x > 3 && x%3 == 0) exit = true;

			while(count > 1 && exit == false)
			{
				if(x%count != 0) count--;
				else exit = true;

				//System.out.println("loop executed. \tx = " + x + " \tcount = " + count + " \texit = " + exit); //test
			}

			if(exit == false)
			{
				System.out.println(x + " is a prime number!");
				primes++;
			}

			x++;
			count = x-1;
			exit = false;

			//System.out.println("end. \t\tx = " + x + " \tcount = " + count + " \texit = " + exit); //test
		}

		System.out.println(primes + " prime numbers found in " + (System.currentTimeMillis() - startTime) + "ms.");
	}

	public static void main(String[] args){
		//Find primes between a and b. pf(a,b)
		pf(1000,1000000);
	}
}
