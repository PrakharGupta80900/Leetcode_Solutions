class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> map=new HashSet<>();
        for(int num:nums){
            if(num%k==0){
                map.add(num);
            }
            
        }
        for(int i=1;i<=nums.length+1;i++){
            int mul=i*k;
            if(!map.contains(mul)){
                return mul;
            }
        }
        return -1;
    }
}