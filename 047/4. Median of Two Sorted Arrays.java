
//! TC == O(N)
//! SC == O(N)

class Solution {
    int [] merge(int []nums1,int [] nums2){
        int a = 0;
        int b = 0;
        int i = 0;
        int arr[] = new int[nums1.length+nums2.length];
        while(a<nums1.length && b<nums2.length){
            if(nums1[a]>nums2[b]){
                arr[i++]=nums2[b++];
            }else{
                arr[i++]=nums1[a++];
            }
        }
        while(a<nums1.length){
            arr[i++] = nums1[a++];
        }
        while(b<nums2.length){
            arr[i++] = nums2[b++];
        }
        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = merge(nums1,nums2);
        int len = nums1.length+nums2.length;
        if(len%2==0){
            // System.out.println(x+" "+y);
            int z = arr[len/2]+arr[len/2-1];
            double ret = (double)z/2;
            return ret;
        }
        return (double)arr[len/2];
    }
}