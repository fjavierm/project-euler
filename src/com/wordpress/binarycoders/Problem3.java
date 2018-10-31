package com.wordpress.binarycoders;

/**
 * Largest prime factor
 * <p>
 * Problem 3
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

	private static final long NUMBER = 600851475143L;

	public static void main(String[] args) {
		System.out.println(Problem3.solve());
	}

	private static long solve() {
		long goal = NUMBER;
		long factor = 2;
		long lastFactor = 1;

		while (goal > 1) {
			while (goal % factor == 0) {
				if (lastFactor != factor) {
					lastFactor = factor;
				}

				goal = goal / factor;
			}

			factor = factor + 1;
		}

		return lastFactor;
	}
}
