class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int mull=1;
        if(nums.length==1){
            if(nums[0]==k){
                return k*2;
            }else{
                return k;
            }
        }
        for(int i=1;i<=nums.length+1;i++){
            mull=i*k;
            if(!map.containsKey(mull)){
                return mull;
            }
        }
        return -1;
    }
}