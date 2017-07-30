package com.sk.learn.mathtest;

public class MaxProduct {
	public static void main(String[] args) {
		int[] nums = new int[]{1,5,3,4,2,6};
		
		System.out.println(maximumProduct(nums));
	}
	
	    static int maximumProduct(int[] nums) {
	        int res = 0;
	        for (int i = 0; i < nums.length - 2; i++) {
	            for (int j = i + 1; j < nums.length - 1; j++) {
	                for (int k = j + 1; k < nums.length; k++) {
	                    res = Math.max(res, nums[i] * nums[j] * nums[k]);
	                }
	            }
	        }
	        return res;
	    }
}
