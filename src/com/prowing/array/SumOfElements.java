package com.prowing.array;

import java.util.Scanner;

public class SumOfElements {
	
	private static Scanner scan;

	public SumOfElements() {
		super();
	}

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = scan.nextInt();
		int[] nums = new int[size];

		System.out.println("Enter numbers in array :");
		for (int i = 0; i < size; i++)
			nums[i] = scan.nextInt();

		System.out.println(findSum(nums));

	}

	public static int findSum(int[] nums) {
		int result = 0;
		for (int n : nums)
			result += n;
		return result;
	}


}
