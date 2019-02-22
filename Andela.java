package com;
// Fibonacci series - A series in which the next number is found by adding up the two numbers before it.

// Write a function such that given an integer N , it will generate and print the Fibonacci sequence up to Nth item.

// Conditions: N > 0, Use recursion to obtain the results

// e.g. Given N = 7, print out  1 1 2 3 5 8 13 ... 

// Write a test to ensure that given N = 7, the sequence equals {1,1,2,3,5,8,13}

class Andela {

	public static void main(String[] args) {
		int i = 1, n = 18, t1 = 1, t2 = 1;
		System.out.print("{");
		while (i <= n) {
			System.out.print(t1 + " , ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;

			i++;
		}
		System.out.print("}");
	}

}