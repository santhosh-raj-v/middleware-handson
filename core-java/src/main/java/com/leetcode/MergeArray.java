package com.leetcode;

public class MergeArray {
    public static void main(String[] args) {
        MergeArray array = new MergeArray();
        int[] nums1={1,2,3,0,0,0};
        int[] nums2= {2,5,6};
        int m=3, n=3;
        array.merge(nums1,m, nums2, n);
        System.out.println("");
        for(int i : nums1) {
            System.out.print(i);
            System.out.print("\t");
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // define pointers on arrays
        int mp = m-1;
        int np = n-1;
        int ptr = m+n-1;

        while(mp >= 0 && np > 0) {
            System.out.println("index to be compared"+ mp + " "+ np);
            System.out.println("values to be compared"+ nums1[mp] + " "+ nums2[np]);
            if(nums1[mp] >= nums2[np]) {
                nums1[ptr] = nums1[mp];
                mp--;
            }  else {
                nums1[ptr] = nums1[np];
                np--;
            }
            ptr--;
        }
        System.out.println("np= "+np);
        System.out.println("remaining values in array2");
        for(int i: nums1){
            System.out.print(i);
            System.out.print("\t");
        }
        while (np >= 0) {
            nums1[ptr] = nums2[np];
            np--;
            ptr--;
        }

    }
}