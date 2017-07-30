package com.sk.learn.median;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 10, 12, 5, 3, 8, 7 };

		RunningMedian runningMedian = new RunningMedian();
		for (double value : runningMedian.getMedians(arr)) {
			System.out.println(value);
		}

	}

	/**
	 * Method used to add elements to heap
	 * 
	 * @param number
	 * @param lower
	 * @param higher
	 */
	public void addNumber(Integer number, PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {

		if (lower.size() == 0 || number < lower.peek()) {
			lower.add(number);
		} else {
			higher.add(number);
		}
	}

	/**
	 * Method used to rebalance the heap
	 * 
	 * @param lower
	 * @param higher
	 */
	public void rebalance(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
		PriorityQueue<Integer> higherHeap = lower.size() > higher.size() ? lower : higher;
		PriorityQueue<Integer> lowerHeap = lower.size() > higher.size() ? higher : lower;
		if (higherHeap.size() - lowerHeap.size() > 1) {
			lowerHeap.add(higherHeap.poll());
		}
	}

	/**
	 * Method used to get running median
	 * 
	 * @param lower
	 * @param higher
	 * @return
	 */
	public double getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {

		PriorityQueue<Integer> lowerHeap = lower.size() > higher.size() ? higher : lower;
		PriorityQueue<Integer> higherHeap = lower.size() > higher.size() ? lower : higher;
		if (higherHeap.size() == lowerHeap.size()) {
			return ((double) higherHeap.peek() + lowerHeap.peek()) / 2;
		} else {
			return higherHeap.peek();
		}

	}

	/**
	 * Method used to get medians
	 * 
	 * @param arr
	 * @return
	 */
	private double[] getMedians(Integer[] arr) {

		PriorityQueue<Integer> lower = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return -1 * a.compareTo(b);
			}
		});
		
		

		PriorityQueue<Integer> higher = new PriorityQueue<Integer>();

		double[] medians = new double[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int number = arr[i];
			addNumber(number, lower, higher);
			rebalance(lower, higher);
			medians[i] = getMedian(lower, higher);
		}
		return medians;
	}
}
