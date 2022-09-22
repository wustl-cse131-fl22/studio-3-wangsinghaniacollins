package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number to sort: ");
		
		int n = in.nextInt();
		
		boolean[]sieve = new boolean[n];
		
		for (int i = 2; i < n; i++) {
			sieve[i] = true;
		}
		for (int i = 2; i < Math.sqrt(n*1.0); i++) 
		{
			if (sieve[i] == true)
			{
				for (int j = (int) Math.pow(i*1.0, 2.0); j < n; j = j + i)
				{
					sieve[j] = false;
				}
			}
		}
		for (int i = 2; i < n; i ++)
		{
			if (sieve[i]==true)
			{
				System.out.println(i);
			}
		}
	}
}
