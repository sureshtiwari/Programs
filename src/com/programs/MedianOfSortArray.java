package com.programs;

class MedianOfSortedArray {
	
	
	public static void main(String args[])
	{
		int[] n1 = {3};
		int[] n2 = {-2,-1};
		System.out.println(findMedianSortedArrays(n1, n2));
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median1 = 0, median2 = 0;
        if(nums1.length!=1){
        if(nums1.length!=0){
        if(nums1.length % 2 == 0 )
            median1 = (nums1[(nums1.length/2)-1]+nums1[nums1.length/2])/2F;
        else
            median1 = nums1[Math.round(nums1.length/2F)-1];
        }
        }
        if(nums2.length!=1){
        if(nums2.length!=0){
        if(nums2.length % 2 == 0)
            median2 = (nums2[(nums2.length/2)-1]+nums2[(nums2.length/2)])/2F;
        else
            median2 = nums2[Math.round(nums2.length/2F)-1];
        }
        }
        
        if(nums1.length==1)
            median1=nums1[0];
        if(nums2.length==1)
            median2=nums2[0];
        
        if(nums1.length==0)
            return median2;
        if(nums2.length==0)
            return median1;
        
        return ((median1+median2)/2F);
        
    }
        
    }
