package com.sk.learn.math;

public class MaxProduct {
	
	    public int maximumProduct(int[] nums) {
	        int res = Math.MIN_VALUE;
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
