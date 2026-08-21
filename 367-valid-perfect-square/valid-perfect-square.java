class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int left=1;
        int right=num/2;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid<=num/mid){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if((ans*ans)==num){
            return true;
        }
        return false;
    }
}