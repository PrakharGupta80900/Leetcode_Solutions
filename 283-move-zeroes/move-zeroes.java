class Solution {
    public void moveZeroes(int[] nums) {
       int left=0;
       int mid=left+1;
       int right=nums.length-1;
       while(left<right && mid<=right){
        if(nums[left]==0){
            if(nums[mid]!=0){
                int temp=nums[left];
                nums[left]=nums[mid];
                nums[mid]=temp;
                left++;
            }else{
                mid++;
            }
        }else{
            left++;
            mid++;
        }
       }
    }
}