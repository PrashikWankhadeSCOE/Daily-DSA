class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums3[] = new int[m];
        for(int z = 0;z<m;z++){
            nums3[z] = nums1[z];
        }
        int i = 0 , j = 0, k = 0;
        while(i<m && j<n){
            if(nums3[i]<nums2[j]){
                nums1[k]=nums3[i];
                i++;
            }
            else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            nums1[k]=nums3[i];
            k++;
            i++;
        }
        while(j<n){
            nums1[k] = nums2[j];
            k++;
            j++;
        }
    }
}
